package typings.symphonyApiClientNode

import typings.symphonyApiClientNode.anon.StreamTypes
import typings.symphonyApiClientNode.streamsClientMod.StreamType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adminClientMod {
  
  @JSImport("symphony-api-client-node/AdminClient", "adminListEnterpriseStreamsV2")
  @js.native
  def adminListEnterpriseStreamsV2(
    streamTypes: js.Array[StreamType],
    scope: String,
    origin: String,
    privacy: String,
    status: String,
    startDate: Double,
    endDate: Double,
    skip: Double,
    limit: Double
  ): js.Promise[AdminStreamListResponse] = js.native
  
  @JSImport("symphony-api-client-node/AdminClient", "importMessages")
  @js.native
  def importMessages(messageList: js.Array[ImportMessage]): js.Promise[js.Array[ImportMessageResult]] = js.native
  
  @JSImport("symphony-api-client-node/AdminClient", "streamMembers")
  @js.native
  def streamMembers(id: String, skip: Double, limit: Double): js.Promise[StreamMembers_] = js.native
  
  @JSImport("symphony-api-client-node/AdminClient", "suppressMessage")
  @js.native
  def suppressMessage(id: String): js.Promise[SuppressedMessage] = js.native
  
  @js.native
  trait AdminStreamAttributes extends StObject {
    
    var createdByUserId: Double = js.native
    
    var createdDate: Double = js.native
    
    var lastMessageDate: Double = js.native
    
    var lastModifiedDate: Double = js.native
    
    var members: js.UndefOr[js.Array[Double]] = js.native
    
    var membersCount: Double = js.native
    
    var originCompany: String = js.native
    
    var originCompanyId: Double = js.native
    
    var roomDescription: js.UndefOr[String] = js.native
    
    var roomName: js.UndefOr[String] = js.native
  }
  object AdminStreamAttributes {
    
    @scala.inline
    def apply(
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
    implicit class AdminStreamAttributesMutableBuilder[Self <: AdminStreamAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreatedByUserId(value: Double): Self = StObject.set(x, "createdByUserId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedDate(value: Double): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastMessageDate(value: Double): Self = StObject.set(x, "lastMessageDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedDate(value: Double): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMembers(value: js.Array[Double]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMembersCount(value: Double): Self = StObject.set(x, "membersCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
      
      @scala.inline
      def setMembersVarargs(value: Double*): Self = StObject.set(x, "members", js.Array(value :_*))
      
      @scala.inline
      def setOriginCompany(value: String): Self = StObject.set(x, "originCompany", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginCompanyId(value: Double): Self = StObject.set(x, "originCompanyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoomDescription(value: String): Self = StObject.set(x, "roomDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoomDescriptionUndefined: Self = StObject.set(x, "roomDescription", js.undefined)
      
      @scala.inline
      def setRoomName(value: String): Self = StObject.set(x, "roomName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoomNameUndefined: Self = StObject.set(x, "roomName", js.undefined)
    }
  }
  
  @js.native
  trait AdminStreamInfo extends StObject {
    
    var attributes: AdminStreamAttributes = js.native
    
    var id: String = js.native
    
    var isActive: Boolean = js.native
    
    var isExternal: Boolean = js.native
    
    var isPublic: Boolean = js.native
    
    var `type`: String = js.native
  }
  object AdminStreamInfo {
    
    @scala.inline
    def apply(
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
    implicit class AdminStreamInfoMutableBuilder[Self <: AdminStreamInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: AdminStreamAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsExternal(value: Boolean): Self = StObject.set(x, "isExternal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPublic(value: Boolean): Self = StObject.set(x, "isPublic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AdminStreamListResponse extends StObject {
    
    var count: Double = js.native
    
    var filter: StreamTypes = js.native
    
    var limit: Double = js.native
    
    var skip: Double = js.native
    
    var streams: js.Array[AdminStreamInfo] = js.native
  }
  object AdminStreamListResponse {
    
    @scala.inline
    def apply(
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
    implicit class AdminStreamListResponseMutableBuilder[Self <: AdminStreamListResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter(value: StreamTypes): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreams(value: js.Array[AdminStreamInfo]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamsVarargs(value: AdminStreamInfo*): Self = StObject.set(x, "streams", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ImportMessage extends StObject {
    
    var data: js.UndefOr[js.Any] = js.native
    
    var intendedMessageFromUserId: Double = js.native
    
    var intendedMessageTimestamp: Double = js.native
    
    var message: String = js.native
    
    var originalMessageId: js.UndefOr[String] = js.native
    
    var originatingSystemId: String = js.native
    
    var streamId: String = js.native
  }
  object ImportMessage {
    
    @scala.inline
    def apply(
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
    implicit class ImportMessageMutableBuilder[Self <: ImportMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setIntendedMessageFromUserId(value: Double): Self = StObject.set(x, "intendedMessageFromUserId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntendedMessageTimestamp(value: Double): Self = StObject.set(x, "intendedMessageTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalMessageId(value: String): Self = StObject.set(x, "originalMessageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalMessageIdUndefined: Self = StObject.set(x, "originalMessageId", js.undefined)
      
      @scala.inline
      def setOriginatingSystemId(value: String): Self = StObject.set(x, "originatingSystemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ImportMessageResult extends StObject {
    
    var diagnostic: js.UndefOr[String] = js.native
    
    var messageId: js.UndefOr[String] = js.native
    
    var originalMessageId: js.UndefOr[String] = js.native
    
    var originatingSystemId: String = js.native
  }
  object ImportMessageResult {
    
    @scala.inline
    def apply(originatingSystemId: String): ImportMessageResult = {
      val __obj = js.Dynamic.literal(originatingSystemId = originatingSystemId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImportMessageResult]
    }
    
    @scala.inline
    implicit class ImportMessageResultMutableBuilder[Self <: ImportMessageResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiagnostic(value: String): Self = StObject.set(x, "diagnostic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagnosticUndefined: Self = StObject.set(x, "diagnostic", js.undefined)
      
      @scala.inline
      def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
      
      @scala.inline
      def setOriginalMessageId(value: String): Self = StObject.set(x, "originalMessageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalMessageIdUndefined: Self = StObject.set(x, "originalMessageId", js.undefined)
      
      @scala.inline
      def setOriginatingSystemId(value: String): Self = StObject.set(x, "originatingSystemId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StreamMember extends StObject {
    
    var isCreator: Boolean = js.native
    
    var isOwner: js.UndefOr[Boolean] = js.native
    
    var joinDate: Double = js.native
    
    var user: StreamUser = js.native
  }
  object StreamMember {
    
    @scala.inline
    def apply(isCreator: Boolean, joinDate: Double, user: StreamUser): StreamMember = {
      val __obj = js.Dynamic.literal(isCreator = isCreator.asInstanceOf[js.Any], joinDate = joinDate.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamMember]
    }
    
    @scala.inline
    implicit class StreamMemberMutableBuilder[Self <: StreamMember] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsCreator(value: Boolean): Self = StObject.set(x, "isCreator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOwner(value: Boolean): Self = StObject.set(x, "isOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOwnerUndefined: Self = StObject.set(x, "isOwner", js.undefined)
      
      @scala.inline
      def setJoinDate(value: Double): Self = StObject.set(x, "joinDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: StreamUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StreamMembers_ extends StObject {
    
    var count: Double = js.native
    
    var limit: Double = js.native
    
    var members: js.Array[StreamMember] = js.native
    
    var skip: Double = js.native
  }
  object StreamMembers_ {
    
    @scala.inline
    def apply(count: Double, limit: Double, members: js.Array[StreamMember], skip: Double): StreamMembers_ = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamMembers_]
    }
    
    @scala.inline
    implicit class StreamMembers_MutableBuilder[Self <: StreamMembers_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMembers(value: js.Array[StreamMember]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMembersVarargs(value: StreamMember*): Self = StObject.set(x, "members", js.Array(value :_*))
      
      @scala.inline
      def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StreamUser extends StObject {
    
    var company: js.UndefOr[String] = js.native
    
    var companyId: js.UndefOr[Double] = js.native
    
    var displayName: js.UndefOr[String] = js.native
    
    var email: js.UndefOr[String] = js.native
    
    var firstName: js.UndefOr[String] = js.native
    
    var isExternal: Boolean = js.native
    
    var lastName: js.UndefOr[String] = js.native
    
    var userId: Double = js.native
  }
  object StreamUser {
    
    @scala.inline
    def apply(isExternal: Boolean, userId: Double): StreamUser = {
      val __obj = js.Dynamic.literal(isExternal = isExternal.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamUser]
    }
    
    @scala.inline
    implicit class StreamUserMutableBuilder[Self <: StreamUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompanyId(value: Double): Self = StObject.set(x, "companyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompanyIdUndefined: Self = StObject.set(x, "companyId", js.undefined)
      
      @scala.inline
      def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
      
      @scala.inline
      def setIsExternal(value: Boolean): Self = StObject.set(x, "isExternal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
      
      @scala.inline
      def setUserId(value: Double): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SuppressedMessage extends StObject {
    
    var messageId: String = js.native
    
    var suppressed: Boolean = js.native
    
    var suppressionDate: Double = js.native
  }
  object SuppressedMessage {
    
    @scala.inline
    def apply(messageId: String, suppressed: Boolean, suppressionDate: Double): SuppressedMessage = {
      val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any], suppressed = suppressed.asInstanceOf[js.Any], suppressionDate = suppressionDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuppressedMessage]
    }
    
    @scala.inline
    implicit class SuppressedMessageMutableBuilder[Self <: SuppressedMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressed(value: Boolean): Self = StObject.set(x, "suppressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressionDate(value: Double): Self = StObject.set(x, "suppressionDate", value.asInstanceOf[js.Any])
    }
  }
}
