package typings.vsoNodeApi

import typings.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typings.vsoNodeApi.profileInterfacesMod.Avatar
import typings.vsoNodeApi.profileInterfacesMod.CreateProfileContext
import typings.vsoNodeApi.profileInterfacesMod.GeoRegion
import typings.vsoNodeApi.profileInterfacesMod.Profile
import typings.vsoNodeApi.profileInterfacesMod.ProfileAttribute
import typings.vsoNodeApi.profileInterfacesMod.ProfileAttributeBase
import typings.vsoNodeApi.profileInterfacesMod.ProfileRegions
import typings.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typings.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import typings.vsoNodeApi.vssinterfacesMod.VssJsonCollectionWrapperV
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object profileApiMod {
  
  @JSImport("vso-node-api/ProfileApi", "ProfileApi")
  @js.native
  class ProfileApi protected () extends IProfileApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
  @js.native
  trait IProfileApi extends ClientApiBase {
    
    def createProfile(createProfileContext: CreateProfileContext): js.Promise[Profile] = js.native
    def createProfile(createProfileContext: CreateProfileContext, autoCreate: Boolean): js.Promise[Profile] = js.native
    
    def deleteProfileAttribute(id: String, descriptor: String): js.Promise[Unit] = js.native
    
    def getAvatar(id: String): js.Promise[Avatar] = js.native
    def getAvatar(id: String, size: js.UndefOr[scala.Nothing], format: String): js.Promise[Avatar] = js.native
    def getAvatar(id: String, size: String): js.Promise[Avatar] = js.native
    def getAvatar(id: String, size: String, format: String): js.Promise[Avatar] = js.native
    
    def getAvatarPreview(container: js.Any, id: String): js.Promise[Avatar] = js.native
    def getAvatarPreview(
      container: js.Any,
      id: String,
      size: js.UndefOr[scala.Nothing],
      format: js.UndefOr[scala.Nothing],
      displayName: String
    ): js.Promise[Avatar] = js.native
    def getAvatarPreview(container: js.Any, id: String, size: js.UndefOr[scala.Nothing], format: String): js.Promise[Avatar] = js.native
    def getAvatarPreview(
      container: js.Any,
      id: String,
      size: js.UndefOr[scala.Nothing],
      format: String,
      displayName: String
    ): js.Promise[Avatar] = js.native
    def getAvatarPreview(container: js.Any, id: String, size: String): js.Promise[Avatar] = js.native
    def getAvatarPreview(
      container: js.Any,
      id: String,
      size: String,
      format: js.UndefOr[scala.Nothing],
      displayName: String
    ): js.Promise[Avatar] = js.native
    def getAvatarPreview(container: js.Any, id: String, size: String, format: String): js.Promise[Avatar] = js.native
    def getAvatarPreview(container: js.Any, id: String, size: String, format: String, displayName: String): js.Promise[Avatar] = js.native
    
    def getGeoRegion(ipaddress: String): js.Promise[GeoRegion] = js.native
    
    def getProfile(id: String): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: js.UndefOr[scala.Nothing],
      withAttributes: js.UndefOr[scala.Nothing],
      partition: js.UndefOr[scala.Nothing],
      coreAttributes: js.UndefOr[scala.Nothing],
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: js.UndefOr[scala.Nothing],
      withAttributes: js.UndefOr[scala.Nothing],
      partition: js.UndefOr[scala.Nothing],
      coreAttributes: String
    ): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: js.UndefOr[scala.Nothing],
      withAttributes: js.UndefOr[scala.Nothing],
      partition: js.UndefOr[scala.Nothing],
      coreAttributes: String,
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: js.UndefOr[scala.Nothing],
      withAttributes: js.UndefOr[scala.Nothing],
      partition: String
    ): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: js.UndefOr[scala.Nothing],
      withAttributes: js.UndefOr[scala.Nothing],
      partition: String,
      coreAttributes: js.UndefOr[scala.Nothing],
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: js.UndefOr[scala.Nothing],
      withAttributes: js.UndefOr[scala.Nothing],
      partition: String,
      coreAttributes: String
    ): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: js.UndefOr[scala.Nothing],
      withAttributes: js.UndefOr[scala.Nothing],
      partition: String,
      coreAttributes: String,
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    def getProfile(id: String, details: js.UndefOr[scala.Nothing], withAttributes: Boolean): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: js.UndefOr[scala.Nothing],
      withAttributes: Boolean,
      partition: js.UndefOr[scala.Nothing],
      coreAttributes: js.UndefOr[scala.Nothing],
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: js.UndefOr[scala.Nothing],
      withAttributes: Boolean,
      partition: js.UndefOr[scala.Nothing],
      coreAttributes: String
    ): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: js.UndefOr[scala.Nothing],
      withAttributes: Boolean,
      partition: js.UndefOr[scala.Nothing],
      coreAttributes: String,
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    def getProfile(id: String, details: js.UndefOr[scala.Nothing], withAttributes: Boolean, partition: String): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: js.UndefOr[scala.Nothing],
      withAttributes: Boolean,
      partition: String,
      coreAttributes: js.UndefOr[scala.Nothing],
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: js.UndefOr[scala.Nothing],
      withAttributes: Boolean,
      partition: String,
      coreAttributes: String
    ): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: js.UndefOr[scala.Nothing],
      withAttributes: Boolean,
      partition: String,
      coreAttributes: String,
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    def getProfile(id: String, details: Boolean): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: Boolean,
      withAttributes: js.UndefOr[scala.Nothing],
      partition: js.UndefOr[scala.Nothing],
      coreAttributes: js.UndefOr[scala.Nothing],
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: Boolean,
      withAttributes: js.UndefOr[scala.Nothing],
      partition: js.UndefOr[scala.Nothing],
      coreAttributes: String
    ): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: Boolean,
      withAttributes: js.UndefOr[scala.Nothing],
      partition: js.UndefOr[scala.Nothing],
      coreAttributes: String,
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    def getProfile(id: String, details: Boolean, withAttributes: js.UndefOr[scala.Nothing], partition: String): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: Boolean,
      withAttributes: js.UndefOr[scala.Nothing],
      partition: String,
      coreAttributes: js.UndefOr[scala.Nothing],
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: Boolean,
      withAttributes: js.UndefOr[scala.Nothing],
      partition: String,
      coreAttributes: String
    ): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: Boolean,
      withAttributes: js.UndefOr[scala.Nothing],
      partition: String,
      coreAttributes: String,
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    def getProfile(id: String, details: Boolean, withAttributes: Boolean): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: Boolean,
      withAttributes: Boolean,
      partition: js.UndefOr[scala.Nothing],
      coreAttributes: js.UndefOr[scala.Nothing],
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: Boolean,
      withAttributes: Boolean,
      partition: js.UndefOr[scala.Nothing],
      coreAttributes: String
    ): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: Boolean,
      withAttributes: Boolean,
      partition: js.UndefOr[scala.Nothing],
      coreAttributes: String,
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    def getProfile(id: String, details: Boolean, withAttributes: Boolean, partition: String): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: Boolean,
      withAttributes: Boolean,
      partition: String,
      coreAttributes: js.UndefOr[scala.Nothing],
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    def getProfile(id: String, details: Boolean, withAttributes: Boolean, partition: String, coreAttributes: String): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: Boolean,
      withAttributes: Boolean,
      partition: String,
      coreAttributes: String,
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    
    def getProfileAttribute(id: String, descriptor: String): js.Promise[ProfileAttribute] = js.native
    
    def getProfileAttributes(id: String, partition: String): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(
      id: String,
      partition: String,
      modifiedSince: js.UndefOr[scala.Nothing],
      modifiedAfterRevision: js.UndefOr[scala.Nothing],
      withCoreAttributes: js.UndefOr[scala.Nothing],
      coreAttributes: String
    ): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(
      id: String,
      partition: String,
      modifiedSince: js.UndefOr[scala.Nothing],
      modifiedAfterRevision: js.UndefOr[scala.Nothing],
      withCoreAttributes: Boolean
    ): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(
      id: String,
      partition: String,
      modifiedSince: js.UndefOr[scala.Nothing],
      modifiedAfterRevision: js.UndefOr[scala.Nothing],
      withCoreAttributes: Boolean,
      coreAttributes: String
    ): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(
      id: String,
      partition: String,
      modifiedSince: js.UndefOr[scala.Nothing],
      modifiedAfterRevision: String
    ): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(
      id: String,
      partition: String,
      modifiedSince: js.UndefOr[scala.Nothing],
      modifiedAfterRevision: String,
      withCoreAttributes: js.UndefOr[scala.Nothing],
      coreAttributes: String
    ): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(
      id: String,
      partition: String,
      modifiedSince: js.UndefOr[scala.Nothing],
      modifiedAfterRevision: String,
      withCoreAttributes: Boolean
    ): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(
      id: String,
      partition: String,
      modifiedSince: js.UndefOr[scala.Nothing],
      modifiedAfterRevision: String,
      withCoreAttributes: Boolean,
      coreAttributes: String
    ): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(id: String, partition: String, modifiedSince: String): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(
      id: String,
      partition: String,
      modifiedSince: String,
      modifiedAfterRevision: js.UndefOr[scala.Nothing],
      withCoreAttributes: js.UndefOr[scala.Nothing],
      coreAttributes: String
    ): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(
      id: String,
      partition: String,
      modifiedSince: String,
      modifiedAfterRevision: js.UndefOr[scala.Nothing],
      withCoreAttributes: Boolean
    ): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(
      id: String,
      partition: String,
      modifiedSince: String,
      modifiedAfterRevision: js.UndefOr[scala.Nothing],
      withCoreAttributes: Boolean,
      coreAttributes: String
    ): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(id: String, partition: String, modifiedSince: String, modifiedAfterRevision: String): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(
      id: String,
      partition: String,
      modifiedSince: String,
      modifiedAfterRevision: String,
      withCoreAttributes: js.UndefOr[scala.Nothing],
      coreAttributes: String
    ): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(
      id: String,
      partition: String,
      modifiedSince: String,
      modifiedAfterRevision: String,
      withCoreAttributes: Boolean
    ): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(
      id: String,
      partition: String,
      modifiedSince: String,
      modifiedAfterRevision: String,
      withCoreAttributes: Boolean,
      coreAttributes: String
    ): js.Promise[js.Array[ProfileAttribute]] = js.native
    
    def getRegions(): js.Promise[ProfileRegions] = js.native
    
    def getSupportedLcids(): js.Promise[js.Array[String]] = js.native
    
    def getUserDefaults(): js.Promise[Profile] = js.native
    def getUserDefaults(includeAvatar: Boolean): js.Promise[Profile] = js.native
    
    def refreshUserDefaults(id: String): js.Promise[Profile] = js.native
    
    def resetAvatar(id: String): js.Promise[Unit] = js.native
    
    def setAvatar(container: js.Any, id: String): js.Promise[Unit] = js.native
    
    def setProfileAttribute(container: js.Any, id: String, descriptor: String): js.Promise[Unit] = js.native
    
    def setProfileAttributes(attributesCollection: VssJsonCollectionWrapperV[js.Array[ProfileAttributeBase[_]]], id: String): js.Promise[Unit] = js.native
    
    def updateProfile(profile: Profile, id: String): js.Promise[Unit] = js.native
  }
}
