package typings.ts3NodejsLibrary

import typings.ts3NodejsLibrary.anon.PartialPermType
import typings.ts3NodejsLibrary.permissionMod.Permission.IConfig
import typings.ts3NodejsLibrary.permissionMod.Permission.PermId
import typings.ts3NodejsLibrary.permissionMod.Permission.PermSid
import typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object permissionMod {
  
  @JSImport("ts3-nodejs-library/lib/util/Permission", "Permission")
  @js.native
  class Permission[T /* <: js.Object */] protected () extends StObject {
    def this(config: IConfig[T]) = this()
    
    var _negate: js.Any = js.native
    
    var _perm: js.Any = js.native
    
    var _skip: js.Any = js.native
    
    var _value: js.Any = js.native
    
    var cmdRemove: js.Any = js.native
    
    var cmdUpdate: js.Any = js.native
    
    var context: js.Any = js.native
    
    /** retrieves the permission object */
    def get(): PermId | PermSid = js.native
    
    /** retrieves a raw object with permid */
    var getAsPermId: js.Any = js.native
    
    /** retrieves a raw object with permsid */
    var getAsPermSid: js.Any = js.native
    
    /** retrieves skip and negate flags */
    var getFlags: js.Any = js.native
    
    /** retrieves wether negate has been set */
    def getNegate(): Boolean = js.native
    
    /** retrieves the current permission */
    def getPerm(): js.UndefOr[String | Double] = js.native
    
    /** retrieves the correct permission name */
    var getPermName: js.Any = js.native
    
    /** retrieves wether skip has been set */
    def getSkip(): Boolean = js.native
    
    /** retrieves the permission value */
    def getValue(): Double = js.native
    
    /** sets/gets the negate value */
    def negate(negate: Boolean): Permission[T] = js.native
    
    /** sets/gets the permid or permsid */
    def perm(perm: String): Permission[T] = js.native
    def perm(perm: Double): Permission[T] = js.native
    
    /** removes the specified permission */
    def remove(): js.Promise[js.Array[js.Any]] = js.native
    
    /** sets/gets the skip value */
    def skip(skip: Boolean): Permission[T] = js.native
    
    var teamspeak: js.Any = js.native
    
    /** updates or adds the permission to the teamspeak server */
    def update(): js.Promise[js.Array[js.Any]] = js.native
    
    /** sets/gets the value for the permission */
    def value(value: Double): Permission[T] = js.native
    
    var withSkipNegate: js.Any = js.native
  }
  /* static members */
  object Permission {
    
    @JSImport("ts3-nodejs-library/lib/util/Permission", "Permission")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getDefaults(perm: PartialPermType): PartialPermType = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaults")(perm.asInstanceOf[js.Any]).asInstanceOf[PartialPermType]
    
    trait BasePermission extends StObject {
      
      var negate: js.UndefOr[Boolean] = js.undefined
      
      var permvalue: Double
      
      var skip: js.UndefOr[Boolean] = js.undefined
    }
    object BasePermission {
      
      @scala.inline
      def apply(permvalue: Double): BasePermission = {
        val __obj = js.Dynamic.literal(permvalue = permvalue.asInstanceOf[js.Any])
        __obj.asInstanceOf[BasePermission]
      }
      
      @scala.inline
      implicit class BasePermissionMutableBuilder[Self <: BasePermission] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNegate(value: Boolean): Self = StObject.set(x, "negate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNegateUndefined: Self = StObject.set(x, "negate", js.undefined)
        
        @scala.inline
        def setPermvalue(value: Double): Self = StObject.set(x, "permvalue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      }
    }
    
    trait IConfig[T] extends StObject {
      
      var allowSkipNegate: js.UndefOr[Boolean] = js.undefined
      
      var context: T
      
      var remove: String
      
      var teamspeak: TeamSpeak
      
      var update: String
    }
    object IConfig {
      
      @scala.inline
      def apply[T](context: T, remove: String, teamspeak: TeamSpeak, update: String): IConfig[T] = {
        val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], teamspeak = teamspeak.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
        __obj.asInstanceOf[IConfig[T]]
      }
      
      @scala.inline
      implicit class IConfigMutableBuilder[Self <: IConfig[?], T] (val x: Self & IConfig[T]) extends AnyVal {
        
        @scala.inline
        def setAllowSkipNegate(value: Boolean): Self = StObject.set(x, "allowSkipNegate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowSkipNegateUndefined: Self = StObject.set(x, "allowSkipNegate", js.undefined)
        
        @scala.inline
        def setContext(value: T): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRemove(value: String): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTeamspeak(value: TeamSpeak): Self = StObject.set(x, "teamspeak", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdate(value: String): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      }
    }
    
    trait PermId
      extends StObject
         with BasePermission {
      
      var permid: Double
    }
    object PermId {
      
      @scala.inline
      def apply(permid: Double, permvalue: Double): PermId = {
        val __obj = js.Dynamic.literal(permid = permid.asInstanceOf[js.Any], permvalue = permvalue.asInstanceOf[js.Any])
        __obj.asInstanceOf[PermId]
      }
      
      @scala.inline
      implicit class PermIdMutableBuilder[Self <: PermId] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPermid(value: Double): Self = StObject.set(x, "permid", value.asInstanceOf[js.Any])
      }
    }
    
    trait PermSid
      extends StObject
         with BasePermission {
      
      var permsid: String
    }
    object PermSid {
      
      @scala.inline
      def apply(permsid: String, permvalue: Double): PermSid = {
        val __obj = js.Dynamic.literal(permsid = permsid.asInstanceOf[js.Any], permvalue = permvalue.asInstanceOf[js.Any])
        __obj.asInstanceOf[PermSid]
      }
      
      @scala.inline
      implicit class PermSidMutableBuilder[Self <: PermSid] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPermsid(value: String): Self = StObject.set(x, "permsid", value.asInstanceOf[js.Any])
      }
    }
    
    trait PermType extends StObject {
      
      var permname: String | Double
      
      var permnegated: js.UndefOr[Boolean] = js.undefined
      
      var permskip: js.UndefOr[Boolean] = js.undefined
      
      var permvalue: Double
    }
    object PermType {
      
      @scala.inline
      def apply(permname: String | Double, permvalue: Double): PermType = {
        val __obj = js.Dynamic.literal(permname = permname.asInstanceOf[js.Any], permvalue = permvalue.asInstanceOf[js.Any])
        __obj.asInstanceOf[PermType]
      }
      
      @scala.inline
      implicit class PermTypeMutableBuilder[Self <: PermType] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPermname(value: String | Double): Self = StObject.set(x, "permname", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPermnegated(value: Boolean): Self = StObject.set(x, "permnegated", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPermnegatedUndefined: Self = StObject.set(x, "permnegated", js.undefined)
        
        @scala.inline
        def setPermskip(value: Boolean): Self = StObject.set(x, "permskip", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPermskipUndefined: Self = StObject.set(x, "permskip", js.undefined)
        
        @scala.inline
        def setPermvalue(value: Double): Self = StObject.set(x, "permvalue", value.asInstanceOf[js.Any])
      }
    }
  }
}
