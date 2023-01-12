package typings.symphonyApiClientNode

import typings.symphonyApiClientNode.anon.StreamTypes
import typings.symphonyApiClientNode.streamsClientMod.StreamType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adminClientMod {
  
  @JSImport("symphony-api-client-node/AdminClient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adminListEnterpriseStreamsV2(
    streamTypes: js.Array[StreamType],
    scope: String,
    origin: String,
    privacy: String,
    status: String,
    startDate: Double,
    endDate: Double,
    skip: Double,
    limit: Double
  ): js.Promise[AdminStreamListResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("adminListEnterpriseStreamsV2")(streamTypes.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], privacy.asInstanceOf[js.Any], status.asInstanceOf[js.Any], startDate.asInstanceOf[js.Any], endDate.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AdminStreamListResponse]]
  
  inline def importMessages(messageList: js.Array[ImportMessage]): js.Promise[js.Array[ImportMessageResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("importMessages")(messageList.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ImportMessageResult]]]
  
  inline def streamMembers(id: String, skip: Double, limit: Double): js.Promise[StreamMembers_] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamMembers")(id.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StreamMembers_]]
  
  inline def suppressMessage(id: String): js.Promise[SuppressedMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("suppressMessage")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SuppressedMessage]]
  
  trait AdminStreamAttributes extends StObject {
    
    var createdByUserId: Double
    
    var createdDate: Double
    
    var lastMessageDate: Double
    
    var lastModifiedDate: Double
    
    var members: js.UndefOr[js.Array[Double]] = js.undefined
    
    var membersCount: Double
    
    var originCompany: String
    
    var originCompanyId: Double
    
    var roomDescription: js.UndefOr[String] = js.undefined
    
    var roomName: js.UndefOr[String] = js.undefined
  }
  object AdminStreamAttributes {
    
    inline def apply(
      createdByUserId: Double,
      createdDate: Double,
      lastMessageDate: Double,
      lastModifiedDate: Double,
      membersCount: Double,
      originCompany: String,
      originCompanyId: Double
    ): AdminStreamAttributes = {
      val __obj = js.Dynamic.literal(createdByUserId = createdByUserId.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], lastMessageDate = lastMessageDate.asInstanceOf[js.Any], lastModifiedDate = lastModifiedDate.asInstanceOf[js.Any], membersCount = membersCount.asInstanceOf[js.Any], originCompany = originCompany.asInstanceOf[js.Any], originCompanyId = originCompanyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdminStreamAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AdminStreamAttributes] (val x: Self) extends AnyVal {
      
      inline def setCreatedByUserId(value: Double): Self = StObject.set(x, "createdByUserId", value.asInstanceOf[js.Any])
      
      inline def setCreatedDate(value: Double): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
      
      inline def setLastMessageDate(value: Double): Self = StObject.set(x, "lastMessageDate", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedDate(value: Double): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
      
      inline def setMembers(value: js.Array[Double]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      inline def setMembersCount(value: Double): Self = StObject.set(x, "membersCount", value.asInstanceOf[js.Any])
      
      inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
      
      inline def setMembersVarargs(value: Double*): Self = StObject.set(x, "members", js.Array(value*))
      
      inline def setOriginCompany(value: String): Self = StObject.set(x, "originCompany", value.asInstanceOf[js.Any])
      
      inline def setOriginCompanyId(value: Double): Self = StObject.set(x, "originCompanyId", value.asInstanceOf[js.Any])
      
      inline def setRoomDescription(value: String): Self = StObject.set(x, "roomDescription", value.asInstanceOf[js.Any])
      
      inline def setRoomDescriptionUndefined: Self = StObject.set(x, "roomDescription", js.undefined)
      
      inline def setRoomName(value: String): Self = StObject.set(x, "roomName", value.asInstanceOf[js.Any])
      
      inline def setRoomNameUndefined: Self = StObject.set(x, "roomName", js.undefined)
    }
  }
  
  trait AdminStreamInfo extends StObject {
    
    var attributes: AdminStreamAttributes
    
    var id: String
    
    var isActive: Boolean
    
    var isExternal: Boolean
    
    var isPublic: Boolean
    
    var `type`: String
  }
  object AdminStreamInfo {
    
    inline def apply(
      attributes: AdminStreamAttributes,
      id: String,
      isActive: Boolean,
      isExternal: Boolean,
      isPublic: Boolean,
      `type`: String
    ): AdminStreamInfo = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isExternal = isExternal.asInstanceOf[js.Any], isPublic = isPublic.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdminStreamInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AdminStreamInfo] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: AdminStreamAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsExternal(value: Boolean): Self = StObject.set(x, "isExternal", value.asInstanceOf[js.Any])
      
      inline def setIsPublic(value: Boolean): Self = StObject.set(x, "isPublic", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait AdminStreamListResponse extends StObject {
    
    var count: Double
    
    var filter: StreamTypes
    
    var limit: Double
    
    var skip: Double
    
    var streams: js.Array[AdminStreamInfo]
  }
  object AdminStreamListResponse {
    
    inline def apply(
      count: Double,
      filter: StreamTypes,
      limit: Double,
      skip: Double,
      streams: js.Array[AdminStreamInfo]
    ): AdminStreamListResponse = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any], streams = streams.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdminStreamListResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AdminStreamListResponse] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setFilter(value: StreamTypes): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setStreams(value: js.Array[AdminStreamInfo]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
      
      inline def setStreamsVarargs(value: AdminStreamInfo*): Self = StObject.set(x, "streams", js.Array(value*))
    }
  }
  
  trait ImportMessage extends StObject {
    
    var data: js.UndefOr[Any] = js.undefined
    
    var intendedMessageFromUserId: Double
    
    var intendedMessageTimestamp: Double
    
    var message: String
    
    var originalMessageId: js.UndefOr[String] = js.undefined
    
    var originatingSystemId: String
    
    var streamId: String
  }
  object ImportMessage {
    
    inline def apply(
      intendedMessageFromUserId: Double,
      intendedMessageTimestamp: Double,
      message: String,
      originatingSystemId: String,
      streamId: String
    ): ImportMessage = {
      val __obj = js.Dynamic.literal(intendedMessageFromUserId = intendedMessageFromUserId.asInstanceOf[js.Any], intendedMessageTimestamp = intendedMessageTimestamp.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], originatingSystemId = originatingSystemId.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImportMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImportMessage] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setIntendedMessageFromUserId(value: Double): Self = StObject.set(x, "intendedMessageFromUserId", value.asInstanceOf[js.Any])
      
      inline def setIntendedMessageTimestamp(value: Double): Self = StObject.set(x, "intendedMessageTimestamp", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setOriginalMessageId(value: String): Self = StObject.set(x, "originalMessageId", value.asInstanceOf[js.Any])
      
      inline def setOriginalMessageIdUndefined: Self = StObject.set(x, "originalMessageId", js.undefined)
      
      inline def setOriginatingSystemId(value: String): Self = StObject.set(x, "originatingSystemId", value.asInstanceOf[js.Any])
      
      inline def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImportMessageResult extends StObject {
    
    var diagnostic: js.UndefOr[String] = js.undefined
    
    var messageId: js.UndefOr[String] = js.undefined
    
    var originalMessageId: js.UndefOr[String] = js.undefined
    
    var originatingSystemId: String
  }
  object ImportMessageResult {
    
    inline def apply(originatingSystemId: String): ImportMessageResult = {
      val __obj = js.Dynamic.literal(originatingSystemId = originatingSystemId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImportMessageResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImportMessageResult] (val x: Self) extends AnyVal {
      
      inline def setDiagnostic(value: String): Self = StObject.set(x, "diagnostic", value.asInstanceOf[js.Any])
      
      inline def setDiagnosticUndefined: Self = StObject.set(x, "diagnostic", js.undefined)
      
      inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
      
      inline def setOriginalMessageId(value: String): Self = StObject.set(x, "originalMessageId", value.asInstanceOf[js.Any])
      
      inline def setOriginalMessageIdUndefined: Self = StObject.set(x, "originalMessageId", js.undefined)
      
      inline def setOriginatingSystemId(value: String): Self = StObject.set(x, "originatingSystemId", value.asInstanceOf[js.Any])
    }
  }
  
  trait StreamMember extends StObject {
    
    var isCreator: Boolean
    
    var isOwner: js.UndefOr[Boolean] = js.undefined
    
    var joinDate: Double
    
    var user: StreamUser
  }
  object StreamMember {
    
    inline def apply(isCreator: Boolean, joinDate: Double, user: StreamUser): StreamMember = {
      val __obj = js.Dynamic.literal(isCreator = isCreator.asInstanceOf[js.Any], joinDate = joinDate.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamMember]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StreamMember] (val x: Self) extends AnyVal {
      
      inline def setIsCreator(value: Boolean): Self = StObject.set(x, "isCreator", value.asInstanceOf[js.Any])
      
      inline def setIsOwner(value: Boolean): Self = StObject.set(x, "isOwner", value.asInstanceOf[js.Any])
      
      inline def setIsOwnerUndefined: Self = StObject.set(x, "isOwner", js.undefined)
      
      inline def setJoinDate(value: Double): Self = StObject.set(x, "joinDate", value.asInstanceOf[js.Any])
      
      inline def setUser(value: StreamUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait StreamMembers_ extends StObject {
    
    var count: Double
    
    var limit: Double
    
    var members: js.Array[StreamMember]
    
    var skip: Double
  }
  object StreamMembers_ {
    
    inline def apply(count: Double, limit: Double, members: js.Array[StreamMember], skip: Double): StreamMembers_ = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamMembers_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StreamMembers_] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setMembers(value: js.Array[StreamMember]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      inline def setMembersVarargs(value: StreamMember*): Self = StObject.set(x, "members", js.Array(value*))
      
      inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    }
  }
  
  trait StreamUser extends StObject {
    
    var company: js.UndefOr[String] = js.undefined
    
    var companyId: js.UndefOr[Double] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var firstName: js.UndefOr[String] = js.undefined
    
    var isExternal: Boolean
    
    var lastName: js.UndefOr[String] = js.undefined
    
    var userId: Double
  }
  object StreamUser {
    
    inline def apply(isExternal: Boolean, userId: Double): StreamUser = {
      val __obj = js.Dynamic.literal(isExternal = isExternal.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamUser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StreamUser] (val x: Self) extends AnyVal {
      
      inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      inline def setCompanyId(value: Double): Self = StObject.set(x, "companyId", value.asInstanceOf[js.Any])
      
      inline def setCompanyIdUndefined: Self = StObject.set(x, "companyId", js.undefined)
      
      inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
      
      inline def setIsExternal(value: Boolean): Self = StObject.set(x, "isExternal", value.asInstanceOf[js.Any])
      
      inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      inline def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
      
      inline def setUserId(value: Double): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  trait SuppressedMessage extends StObject {
    
    var messageId: String
    
    var suppressed: Boolean
    
    var suppressionDate: Double
  }
  object SuppressedMessage {
    
    inline def apply(messageId: String, suppressed: Boolean, suppressionDate: Double): SuppressedMessage = {
      val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any], suppressed = suppressed.asInstanceOf[js.Any], suppressionDate = suppressionDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuppressedMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SuppressedMessage] (val x: Self) extends AnyVal {
      
      inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      inline def setSuppressed(value: Boolean): Self = StObject.set(x, "suppressed", value.asInstanceOf[js.Any])
      
      inline def setSuppressionDate(value: Double): Self = StObject.set(x, "suppressionDate", value.asInstanceOf[js.Any])
    }
  }
}
