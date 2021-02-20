package typings.symphonyApiClientNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usersClientMod {
  
  @JSImport("symphony-api-client-node/UsersClient", "getUserFromEmail")
  @js.native
  def getUserFromEmail(email: String): js.Promise[User] = js.native
  @JSImport("symphony-api-client-node/UsersClient", "getUserFromEmail")
  @js.native
  def getUserFromEmail(email: String, local: Boolean): js.Promise[User] = js.native
  
  @JSImport("symphony-api-client-node/UsersClient", "getUserFromUsername")
  @js.native
  def getUserFromUsername(username: String): js.Promise[User] = js.native
  
  @JSImport("symphony-api-client-node/UsersClient", "getUsersFromEmailList")
  @js.native
  def getUsersFromEmailList(commaSeparatedEmails: String): js.Promise[UsersList] = js.native
  @JSImport("symphony-api-client-node/UsersClient", "getUsersFromEmailList")
  @js.native
  def getUsersFromEmailList(commaSeparatedEmails: String, local: Boolean): js.Promise[UsersList] = js.native
  
  @JSImport("symphony-api-client-node/UsersClient", "getUsersFromIdList")
  @js.native
  def getUsersFromIdList(commaSeparatedIds: String): js.Promise[UsersList] = js.native
  @JSImport("symphony-api-client-node/UsersClient", "getUsersFromIdList")
  @js.native
  def getUsersFromIdList(commaSeparatedIds: String, local: Boolean): js.Promise[UsersList] = js.native
  
  @JSImport("symphony-api-client-node/UsersClient", "searchUsers")
  @js.native
  def searchUsers(query: String): js.Promise[SearchUserResponse] = js.native
  @JSImport("symphony-api-client-node/UsersClient", "searchUsers")
  @js.native
  def searchUsers(
    query: String,
    local: js.UndefOr[scala.Nothing],
    skip: js.UndefOr[scala.Nothing],
    limit: js.UndefOr[scala.Nothing],
    filter: UserFilter
  ): js.Promise[SearchUserResponse] = js.native
  @JSImport("symphony-api-client-node/UsersClient", "searchUsers")
  @js.native
  def searchUsers(query: String, local: js.UndefOr[scala.Nothing], skip: js.UndefOr[scala.Nothing], limit: Double): js.Promise[SearchUserResponse] = js.native
  @JSImport("symphony-api-client-node/UsersClient", "searchUsers")
  @js.native
  def searchUsers(
    query: String,
    local: js.UndefOr[scala.Nothing],
    skip: js.UndefOr[scala.Nothing],
    limit: Double,
    filter: UserFilter
  ): js.Promise[SearchUserResponse] = js.native
  @JSImport("symphony-api-client-node/UsersClient", "searchUsers")
  @js.native
  def searchUsers(query: String, local: js.UndefOr[scala.Nothing], skip: Double): js.Promise[SearchUserResponse] = js.native
  @JSImport("symphony-api-client-node/UsersClient", "searchUsers")
  @js.native
  def searchUsers(
    query: String,
    local: js.UndefOr[scala.Nothing],
    skip: Double,
    limit: js.UndefOr[scala.Nothing],
    filter: UserFilter
  ): js.Promise[SearchUserResponse] = js.native
  @JSImport("symphony-api-client-node/UsersClient", "searchUsers")
  @js.native
  def searchUsers(query: String, local: js.UndefOr[scala.Nothing], skip: Double, limit: Double): js.Promise[SearchUserResponse] = js.native
  @JSImport("symphony-api-client-node/UsersClient", "searchUsers")
  @js.native
  def searchUsers(query: String, local: js.UndefOr[scala.Nothing], skip: Double, limit: Double, filter: UserFilter): js.Promise[SearchUserResponse] = js.native
  @JSImport("symphony-api-client-node/UsersClient", "searchUsers")
  @js.native
  def searchUsers(query: String, local: Boolean): js.Promise[SearchUserResponse] = js.native
  @JSImport("symphony-api-client-node/UsersClient", "searchUsers")
  @js.native
  def searchUsers(
    query: String,
    local: Boolean,
    skip: js.UndefOr[scala.Nothing],
    limit: js.UndefOr[scala.Nothing],
    filter: UserFilter
  ): js.Promise[SearchUserResponse] = js.native
  @JSImport("symphony-api-client-node/UsersClient", "searchUsers")
  @js.native
  def searchUsers(query: String, local: Boolean, skip: js.UndefOr[scala.Nothing], limit: Double): js.Promise[SearchUserResponse] = js.native
  @JSImport("symphony-api-client-node/UsersClient", "searchUsers")
  @js.native
  def searchUsers(query: String, local: Boolean, skip: js.UndefOr[scala.Nothing], limit: Double, filter: UserFilter): js.Promise[SearchUserResponse] = js.native
  @JSImport("symphony-api-client-node/UsersClient", "searchUsers")
  @js.native
  def searchUsers(query: String, local: Boolean, skip: Double): js.Promise[SearchUserResponse] = js.native
  @JSImport("symphony-api-client-node/UsersClient", "searchUsers")
  @js.native
  def searchUsers(query: String, local: Boolean, skip: Double, limit: js.UndefOr[scala.Nothing], filter: UserFilter): js.Promise[SearchUserResponse] = js.native
  @JSImport("symphony-api-client-node/UsersClient", "searchUsers")
  @js.native
  def searchUsers(query: String, local: Boolean, skip: Double, limit: Double): js.Promise[SearchUserResponse] = js.native
  @JSImport("symphony-api-client-node/UsersClient", "searchUsers")
  @js.native
  def searchUsers(query: String, local: Boolean, skip: Double, limit: Double, filter: UserFilter): js.Promise[SearchUserResponse] = js.native
  
  @js.native
  trait Avatar extends StObject {
    
    var size: String = js.native
    
    var url: String = js.native
  }
  object Avatar {
    
    @scala.inline
    def apply(size: String, url: String): Avatar = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Avatar]
    }
    
    @scala.inline
    implicit class AvatarMutableBuilder[Self <: Avatar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SearchUserResponse extends UsersList {
    
    var count: Double = js.native
    
    var filters: UserFilter = js.native
    
    var limit: Double = js.native
    
    var query: String = js.native
    
    var skip: Double = js.native
  }
  object SearchUserResponse {
    
    @scala.inline
    def apply(
      count: Double,
      filters: UserFilter,
      limit: Double,
      query: String,
      skip: Double,
      users: js.Array[User]
    ): SearchUserResponse = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchUserResponse]
    }
    
    @scala.inline
    implicit class SearchUserResponseMutableBuilder[Self <: SearchUserResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilters(value: UserFilter): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait User extends StObject {
    
    var accountType: js.UndefOr[String] = js.native
    
    var avatars: js.UndefOr[js.Array[Avatar]] = js.native
    
    var company: js.UndefOr[String] = js.native
    
    var department: js.UndefOr[String] = js.native
    
    var displayName: String = js.native
    
    var emailAddress: String = js.native
    
    var firstName: String = js.native
    
    var id: String = js.native
    
    var lastName: String = js.native
    
    var location: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var username: js.UndefOr[String] = js.native
  }
  object User {
    
    @scala.inline
    def apply(displayName: String, emailAddress: String, firstName: String, id: String, lastName: String): User = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any])
      __obj.asInstanceOf[User]
    }
    
    @scala.inline
    implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountType(value: String): Self = StObject.set(x, "accountType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountTypeUndefined: Self = StObject.set(x, "accountType", js.undefined)
      
      @scala.inline
      def setAvatars(value: js.Array[Avatar]): Self = StObject.set(x, "avatars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvatarsUndefined: Self = StObject.set(x, "avatars", js.undefined)
      
      @scala.inline
      def setAvatarsVarargs(value: Avatar*): Self = StObject.set(x, "avatars", js.Array(value :_*))
      
      @scala.inline
      def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
      
      @scala.inline
      def setDepartment(value: String): Self = StObject.set(x, "department", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepartmentUndefined: Self = StObject.set(x, "department", js.undefined)
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  @js.native
  trait UserFilter extends StObject {
    
    var company: js.UndefOr[String] = js.native
    
    var location: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object UserFilter {
    
    @scala.inline
    def apply(): UserFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserFilter]
    }
    
    @scala.inline
    implicit class UserFilterMutableBuilder[Self <: UserFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait UsersList extends StObject {
    
    var users: js.Array[User] = js.native
  }
  object UsersList {
    
    @scala.inline
    def apply(users: js.Array[User]): UsersList = {
      val __obj = js.Dynamic.literal(users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsersList]
    }
    
    @scala.inline
    implicit class UsersListMutableBuilder[Self <: UsersList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUsers(value: js.Array[User]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersVarargs(value: User*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
}
