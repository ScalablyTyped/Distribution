package typings.symphonyApiClientNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usersClientMod {
  
  @JSImport("symphony-api-client-node/UsersClient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getUserFromEmail(email: String): js.Promise[User] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserFromEmail")(email.asInstanceOf[js.Any]).asInstanceOf[js.Promise[User]]
  inline def getUserFromEmail(email: String, local: Boolean): js.Promise[User] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUserFromEmail")(email.asInstanceOf[js.Any], local.asInstanceOf[js.Any])).asInstanceOf[js.Promise[User]]
  
  inline def getUserFromUsername(username: String): js.Promise[User] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserFromUsername")(username.asInstanceOf[js.Any]).asInstanceOf[js.Promise[User]]
  
  inline def getUsersFromEmailList(commaSeparatedEmails: String): js.Promise[UsersList] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUsersFromEmailList")(commaSeparatedEmails.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UsersList]]
  inline def getUsersFromEmailList(commaSeparatedEmails: String, local: Boolean): js.Promise[UsersList] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUsersFromEmailList")(commaSeparatedEmails.asInstanceOf[js.Any], local.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UsersList]]
  
  inline def getUsersFromIdList(commaSeparatedIds: String): js.Promise[UsersList] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUsersFromIdList")(commaSeparatedIds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UsersList]]
  inline def getUsersFromIdList(commaSeparatedIds: String, local: Boolean): js.Promise[UsersList] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUsersFromIdList")(commaSeparatedIds.asInstanceOf[js.Any], local.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UsersList]]
  
  inline def searchUsers(query: String): js.Promise[SearchUserResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("searchUsers")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SearchUserResponse]]
  inline def searchUsers(query: String, local: Boolean): js.Promise[SearchUserResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchUsers")(query.asInstanceOf[js.Any], local.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchUserResponse]]
  inline def searchUsers(query: String, local: Boolean, skip: Double): js.Promise[SearchUserResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchUsers")(query.asInstanceOf[js.Any], local.asInstanceOf[js.Any], skip.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchUserResponse]]
  inline def searchUsers(query: String, local: Boolean, skip: Double, limit: Double): js.Promise[SearchUserResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchUsers")(query.asInstanceOf[js.Any], local.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchUserResponse]]
  inline def searchUsers(query: String, local: Boolean, skip: Double, limit: Double, filter: UserFilter): js.Promise[SearchUserResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchUsers")(query.asInstanceOf[js.Any], local.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchUserResponse]]
  inline def searchUsers(query: String, local: Boolean, skip: Double, limit: Unit, filter: UserFilter): js.Promise[SearchUserResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchUsers")(query.asInstanceOf[js.Any], local.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchUserResponse]]
  inline def searchUsers(query: String, local: Boolean, skip: Unit, limit: Double): js.Promise[SearchUserResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchUsers")(query.asInstanceOf[js.Any], local.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchUserResponse]]
  inline def searchUsers(query: String, local: Boolean, skip: Unit, limit: Double, filter: UserFilter): js.Promise[SearchUserResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchUsers")(query.asInstanceOf[js.Any], local.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchUserResponse]]
  inline def searchUsers(query: String, local: Boolean, skip: Unit, limit: Unit, filter: UserFilter): js.Promise[SearchUserResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchUsers")(query.asInstanceOf[js.Any], local.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchUserResponse]]
  inline def searchUsers(query: String, local: Unit, skip: Double): js.Promise[SearchUserResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchUsers")(query.asInstanceOf[js.Any], local.asInstanceOf[js.Any], skip.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchUserResponse]]
  inline def searchUsers(query: String, local: Unit, skip: Double, limit: Double): js.Promise[SearchUserResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchUsers")(query.asInstanceOf[js.Any], local.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchUserResponse]]
  inline def searchUsers(query: String, local: Unit, skip: Double, limit: Double, filter: UserFilter): js.Promise[SearchUserResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchUsers")(query.asInstanceOf[js.Any], local.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchUserResponse]]
  inline def searchUsers(query: String, local: Unit, skip: Double, limit: Unit, filter: UserFilter): js.Promise[SearchUserResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchUsers")(query.asInstanceOf[js.Any], local.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchUserResponse]]
  inline def searchUsers(query: String, local: Unit, skip: Unit, limit: Double): js.Promise[SearchUserResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchUsers")(query.asInstanceOf[js.Any], local.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchUserResponse]]
  inline def searchUsers(query: String, local: Unit, skip: Unit, limit: Double, filter: UserFilter): js.Promise[SearchUserResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchUsers")(query.asInstanceOf[js.Any], local.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchUserResponse]]
  inline def searchUsers(query: String, local: Unit, skip: Unit, limit: Unit, filter: UserFilter): js.Promise[SearchUserResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchUsers")(query.asInstanceOf[js.Any], local.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchUserResponse]]
  
  trait Avatar extends StObject {
    
    var size: String
    
    var url: String
  }
  object Avatar {
    
    inline def apply(size: String, url: String): Avatar = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Avatar]
    }
    
    extension [Self <: Avatar](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SearchUserResponse
    extends StObject
       with UsersList {
    
    var count: Double
    
    var filters: UserFilter
    
    var limit: Double
    
    var query: String
    
    var skip: Double
  }
  object SearchUserResponse {
    
    inline def apply(
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
    
    extension [Self <: SearchUserResponse](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setFilters(value: UserFilter): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    }
  }
  
  trait User extends StObject {
    
    var accountType: js.UndefOr[String] = js.undefined
    
    var avatars: js.UndefOr[js.Array[Avatar]] = js.undefined
    
    var company: js.UndefOr[String] = js.undefined
    
    var department: js.UndefOr[String] = js.undefined
    
    var displayName: String
    
    var emailAddress: String
    
    var firstName: String
    
    var id: String
    
    var lastName: String
    
    var location: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object User {
    
    inline def apply(displayName: String, emailAddress: String, firstName: String, id: String, lastName: String): User = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any])
      __obj.asInstanceOf[User]
    }
    
    extension [Self <: User](x: Self) {
      
      inline def setAccountType(value: String): Self = StObject.set(x, "accountType", value.asInstanceOf[js.Any])
      
      inline def setAccountTypeUndefined: Self = StObject.set(x, "accountType", js.undefined)
      
      inline def setAvatars(value: js.Array[Avatar]): Self = StObject.set(x, "avatars", value.asInstanceOf[js.Any])
      
      inline def setAvatarsUndefined: Self = StObject.set(x, "avatars", js.undefined)
      
      inline def setAvatarsVarargs(value: Avatar*): Self = StObject.set(x, "avatars", js.Array(value*))
      
      inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
      
      inline def setDepartment(value: String): Self = StObject.set(x, "department", value.asInstanceOf[js.Any])
      
      inline def setDepartmentUndefined: Self = StObject.set(x, "department", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
      
      inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait UserFilter extends StObject {
    
    var company: js.UndefOr[String] = js.undefined
    
    var location: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object UserFilter {
    
    inline def apply(): UserFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserFilter]
    }
    
    extension [Self <: UserFilter](x: Self) {
      
      inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait UsersList extends StObject {
    
    var users: js.Array[User]
  }
  object UsersList {
    
    inline def apply(users: js.Array[User]): UsersList = {
      val __obj = js.Dynamic.literal(users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsersList]
    }
    
    extension [Self <: UsersList](x: Self) {
      
      inline def setUsers(value: js.Array[User]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setUsersVarargs(value: User*): Self = StObject.set(x, "users", js.Array(value*))
    }
  }
}
