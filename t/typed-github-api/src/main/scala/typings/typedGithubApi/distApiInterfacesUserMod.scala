package typings.typedGithubApi

import typings.typedGithubApi.anon.Collaborators
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distApiInterfacesUserMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.typedGithubApi.distApiInterfacesUserMod.UserOrOrgSummary because Already inherited
  - typings.typedGithubApi.distApiInterfacesUserMod.UserOrOrg because var conflicts: avatar_url, events_url, id, login, repos_url, `type`, url. Inlined name, company, blog, location, email, public_repos, public_gists, followers, following, created_at, updated_at */ trait Organization
    extends StObject
       with OrganizationSummary {
    
    var blog: String
    
    var company: String
    
    var created_at: js.Date
    
    var email: String
    
    var followers: Double
    
    var following: Double
    
    var has_organization_projects: Boolean
    
    var has_repository_projects: Boolean
    
    var html_url: String
    
    var location: String
    
    var name: String
    
    var public_gists: Double
    
    var public_repos: Double
    
    var updated_at: js.Date
  }
  object Organization {
    
    inline def apply(
      avatar_url: String,
      blog: String,
      company: String,
      created_at: js.Date,
      description: String,
      email: String,
      events_url: String,
      followers: Double,
      following: Double,
      has_organization_projects: Boolean,
      has_repository_projects: Boolean,
      hooks_url: String,
      html_url: String,
      id: Double,
      issues_url: String,
      location: String,
      login: String,
      members_url: String,
      name: String,
      public_gists: Double,
      public_members_url: String,
      public_repos: Double,
      repos_url: String,
      updated_at: js.Date,
      url: String
    ): Organization = {
      val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], blog = blog.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], has_organization_projects = has_organization_projects.asInstanceOf[js.Any], has_repository_projects = has_repository_projects.asInstanceOf[js.Any], hooks_url = hooks_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issues_url = issues_url.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], public_gists = public_gists.asInstanceOf[js.Any], public_members_url = public_members_url.asInstanceOf[js.Any], public_repos = public_repos.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Organization")
      __obj.asInstanceOf[Organization]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Organization] (val x: Self) extends AnyVal {
      
      inline def setBlog(value: String): Self = StObject.set(x, "blog", value.asInstanceOf[js.Any])
      
      inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      inline def setCreated_at(value: js.Date): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setFollowers(value: Double): Self = StObject.set(x, "followers", value.asInstanceOf[js.Any])
      
      inline def setFollowing(value: Double): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
      
      inline def setHas_organization_projects(value: Boolean): Self = StObject.set(x, "has_organization_projects", value.asInstanceOf[js.Any])
      
      inline def setHas_repository_projects(value: Boolean): Self = StObject.set(x, "has_repository_projects", value.asInstanceOf[js.Any])
      
      inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPublic_gists(value: Double): Self = StObject.set(x, "public_gists", value.asInstanceOf[js.Any])
      
      inline def setPublic_repos(value: Double): Self = StObject.set(x, "public_repos", value.asInstanceOf[js.Any])
      
      inline def setUpdated_at(value: js.Date): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    }
  }
  
  trait OrganizationSummary
    extends StObject
       with UserOrOrgSummary {
    
    var description: String
    
    var hooks_url: String
    
    var issues_url: String
    
    var members_url: String
    
    var public_members_url: String
    
    @JSName("type")
    var type_OrganizationSummary: typings.typedGithubApi.typedGithubApiStrings.Organization
  }
  object OrganizationSummary {
    
    inline def apply(
      avatar_url: String,
      description: String,
      events_url: String,
      hooks_url: String,
      id: Double,
      issues_url: String,
      login: String,
      members_url: String,
      public_members_url: String,
      repos_url: String,
      url: String
    ): OrganizationSummary = {
      val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], hooks_url = hooks_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issues_url = issues_url.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], public_members_url = public_members_url.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Organization")
      __obj.asInstanceOf[OrganizationSummary]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OrganizationSummary] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setHooks_url(value: String): Self = StObject.set(x, "hooks_url", value.asInstanceOf[js.Any])
      
      inline def setIssues_url(value: String): Self = StObject.set(x, "issues_url", value.asInstanceOf[js.Any])
      
      inline def setMembers_url(value: String): Self = StObject.set(x, "members_url", value.asInstanceOf[js.Any])
      
      inline def setPublic_members_url(value: String): Self = StObject.set(x, "public_members_url", value.asInstanceOf[js.Any])
      
      inline def setType(value: typings.typedGithubApi.typedGithubApiStrings.Organization): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.typedGithubApi.distApiInterfacesUserMod.UserOrOrgSummary because Already inherited
  - typings.typedGithubApi.distApiInterfacesUserMod.UserOrOrg because Already inherited
  - typings.typedGithubApi.distApiInterfacesUserMod.PrivateUserOrOrg because var conflicts: avatar_url, blog, company, created_at, email, events_url, followers, following, id, location, login, name, public_gists, public_repos, repos_url, `type`, updated_at, url. Inlined total_private_repos, owned_private_repos, private_gists, disk_usage, collaborators, plan */ trait PrivateOrganization
    extends StObject
       with Organization {
    
    var billing_email: String
    
    var collaborators: Double
    
    var default_repository_settings: String
    
    var disk_usage: Double
    
    var members_can_create_repositories: Boolean
    
    var owned_private_repos: Double
    
    var plan: Collaborators
    
    var private_gists: Double
    
    var total_private_repos: Double
  }
  object PrivateOrganization {
    
    inline def apply(
      avatar_url: String,
      billing_email: String,
      blog: String,
      collaborators: Double,
      company: String,
      created_at: js.Date,
      default_repository_settings: String,
      description: String,
      disk_usage: Double,
      email: String,
      events_url: String,
      followers: Double,
      following: Double,
      has_organization_projects: Boolean,
      has_repository_projects: Boolean,
      hooks_url: String,
      html_url: String,
      id: Double,
      issues_url: String,
      location: String,
      login: String,
      members_can_create_repositories: Boolean,
      members_url: String,
      name: String,
      owned_private_repos: Double,
      plan: Collaborators,
      private_gists: Double,
      public_gists: Double,
      public_members_url: String,
      public_repos: Double,
      repos_url: String,
      total_private_repos: Double,
      updated_at: js.Date,
      url: String
    ): PrivateOrganization = {
      val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], billing_email = billing_email.asInstanceOf[js.Any], blog = blog.asInstanceOf[js.Any], collaborators = collaborators.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], default_repository_settings = default_repository_settings.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], disk_usage = disk_usage.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], has_organization_projects = has_organization_projects.asInstanceOf[js.Any], has_repository_projects = has_repository_projects.asInstanceOf[js.Any], hooks_url = hooks_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issues_url = issues_url.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], members_can_create_repositories = members_can_create_repositories.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owned_private_repos = owned_private_repos.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], private_gists = private_gists.asInstanceOf[js.Any], public_gists = public_gists.asInstanceOf[js.Any], public_members_url = public_members_url.asInstanceOf[js.Any], public_repos = public_repos.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], total_private_repos = total_private_repos.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Organization")
      __obj.asInstanceOf[PrivateOrganization]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrivateOrganization] (val x: Self) extends AnyVal {
      
      inline def setBilling_email(value: String): Self = StObject.set(x, "billing_email", value.asInstanceOf[js.Any])
      
      inline def setCollaborators(value: Double): Self = StObject.set(x, "collaborators", value.asInstanceOf[js.Any])
      
      inline def setDefault_repository_settings(value: String): Self = StObject.set(x, "default_repository_settings", value.asInstanceOf[js.Any])
      
      inline def setDisk_usage(value: Double): Self = StObject.set(x, "disk_usage", value.asInstanceOf[js.Any])
      
      inline def setMembers_can_create_repositories(value: Boolean): Self = StObject.set(x, "members_can_create_repositories", value.asInstanceOf[js.Any])
      
      inline def setOwned_private_repos(value: Double): Self = StObject.set(x, "owned_private_repos", value.asInstanceOf[js.Any])
      
      inline def setPlan(value: Collaborators): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
      
      inline def setPrivate_gists(value: Double): Self = StObject.set(x, "private_gists", value.asInstanceOf[js.Any])
      
      inline def setTotal_private_repos(value: Double): Self = StObject.set(x, "total_private_repos", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.typedGithubApi.distApiInterfacesUserMod.UserOrOrgSummary because Already inherited
  - typings.typedGithubApi.distApiInterfacesUserMod.UserOrOrg because Already inherited
  - typings.typedGithubApi.distApiInterfacesUserMod.PrivateUserOrOrg because var conflicts: avatar_url, blog, company, created_at, email, events_url, followers, following, id, location, login, name, public_gists, public_repos, repos_url, `type`, updated_at, url. Inlined total_private_repos, owned_private_repos, private_gists, disk_usage, collaborators, plan */ trait PrivateUser
    extends StObject
       with User {
    
    var collaborators: Double
    
    var disk_usage: Double
    
    var owned_private_repos: Double
    
    var plan: Collaborators
    
    var private_gists: Double
    
    var total_private_repos: Double
    
    var two_factor_authentication: Boolean
  }
  object PrivateUser {
    
    inline def apply(
      avatar_url: String,
      bio: String,
      blog: String,
      collaborators: Double,
      company: String,
      created_at: js.Date,
      disk_usage: Double,
      email: String,
      events_url: String,
      followers: Double,
      followers_url: String,
      following: Double,
      following_url: String,
      gists_url: String,
      gravatar_id: String,
      hireable: Boolean,
      html_url: String,
      id: Double,
      location: String,
      login: String,
      name: String,
      organizations_url: String,
      owned_private_repos: Double,
      plan: Collaborators,
      private_gists: Double,
      public_gists: Double,
      public_repos: Double,
      received_events_url: String,
      repos_url: String,
      site_admin: Boolean,
      starred_url: String,
      subscriptions_url: String,
      total_private_repos: Double,
      two_factor_authentication: Boolean,
      updated_at: js.Date,
      url: String
    ): PrivateUser = {
      val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], bio = bio.asInstanceOf[js.Any], blog = blog.asInstanceOf[js.Any], collaborators = collaborators.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], disk_usage = disk_usage.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], followers_url = followers_url.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], following_url = following_url.asInstanceOf[js.Any], gists_url = gists_url.asInstanceOf[js.Any], gravatar_id = gravatar_id.asInstanceOf[js.Any], hireable = hireable.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], organizations_url = organizations_url.asInstanceOf[js.Any], owned_private_repos = owned_private_repos.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], private_gists = private_gists.asInstanceOf[js.Any], public_gists = public_gists.asInstanceOf[js.Any], public_repos = public_repos.asInstanceOf[js.Any], received_events_url = received_events_url.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], site_admin = site_admin.asInstanceOf[js.Any], starred_url = starred_url.asInstanceOf[js.Any], subscriptions_url = subscriptions_url.asInstanceOf[js.Any], total_private_repos = total_private_repos.asInstanceOf[js.Any], two_factor_authentication = two_factor_authentication.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("User")
      __obj.asInstanceOf[PrivateUser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrivateUser] (val x: Self) extends AnyVal {
      
      inline def setCollaborators(value: Double): Self = StObject.set(x, "collaborators", value.asInstanceOf[js.Any])
      
      inline def setDisk_usage(value: Double): Self = StObject.set(x, "disk_usage", value.asInstanceOf[js.Any])
      
      inline def setOwned_private_repos(value: Double): Self = StObject.set(x, "owned_private_repos", value.asInstanceOf[js.Any])
      
      inline def setPlan(value: Collaborators): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
      
      inline def setPrivate_gists(value: Double): Self = StObject.set(x, "private_gists", value.asInstanceOf[js.Any])
      
      inline def setTotal_private_repos(value: Double): Self = StObject.set(x, "total_private_repos", value.asInstanceOf[js.Any])
      
      inline def setTwo_factor_authentication(value: Boolean): Self = StObject.set(x, "two_factor_authentication", value.asInstanceOf[js.Any])
    }
  }
  
  trait PrivateUserOrOrg
    extends StObject
       with UserOrOrg {
    
    var collaborators: Double
    
    var disk_usage: Double
    
    var owned_private_repos: Double
    
    var plan: Collaborators
    
    var private_gists: Double
    
    var total_private_repos: Double
  }
  object PrivateUserOrOrg {
    
    inline def apply(
      avatar_url: String,
      blog: String,
      collaborators: Double,
      company: String,
      created_at: js.Date,
      disk_usage: Double,
      email: String,
      events_url: String,
      followers: Double,
      following: Double,
      id: Double,
      location: String,
      login: String,
      name: String,
      owned_private_repos: Double,
      plan: Collaborators,
      private_gists: Double,
      public_gists: Double,
      public_repos: Double,
      repos_url: String,
      total_private_repos: Double,
      `type`: typings.typedGithubApi.typedGithubApiStrings.User | typings.typedGithubApi.typedGithubApiStrings.Organization,
      updated_at: js.Date,
      url: String
    ): PrivateUserOrOrg = {
      val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], blog = blog.asInstanceOf[js.Any], collaborators = collaborators.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], disk_usage = disk_usage.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owned_private_repos = owned_private_repos.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], private_gists = private_gists.asInstanceOf[js.Any], public_gists = public_gists.asInstanceOf[js.Any], public_repos = public_repos.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], total_private_repos = total_private_repos.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrivateUserOrOrg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrivateUserOrOrg] (val x: Self) extends AnyVal {
      
      inline def setCollaborators(value: Double): Self = StObject.set(x, "collaborators", value.asInstanceOf[js.Any])
      
      inline def setDisk_usage(value: Double): Self = StObject.set(x, "disk_usage", value.asInstanceOf[js.Any])
      
      inline def setOwned_private_repos(value: Double): Self = StObject.set(x, "owned_private_repos", value.asInstanceOf[js.Any])
      
      inline def setPlan(value: Collaborators): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
      
      inline def setPrivate_gists(value: Double): Self = StObject.set(x, "private_gists", value.asInstanceOf[js.Any])
      
      inline def setTotal_private_repos(value: Double): Self = StObject.set(x, "total_private_repos", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.typedGithubApi.distApiInterfacesUserMod.UserOrOrgSummary because Already inherited
  - typings.typedGithubApi.distApiInterfacesUserMod.UserOrOrg because var conflicts: avatar_url, events_url, id, login, repos_url, `type`, url. Inlined name, company, blog, location, email, public_repos, public_gists, followers, following, created_at, updated_at */ trait User
    extends StObject
       with UserSummary {
    
    var bio: String
    
    var blog: String
    
    var company: String
    
    var created_at: js.Date
    
    var email: String
    
    var followers: Double
    
    var following: Double
    
    var hireable: Boolean
    
    var location: String
    
    var name: String
    
    var public_gists: Double
    
    var public_repos: Double
    
    var updated_at: js.Date
  }
  object User {
    
    inline def apply(
      avatar_url: String,
      bio: String,
      blog: String,
      company: String,
      created_at: js.Date,
      email: String,
      events_url: String,
      followers: Double,
      followers_url: String,
      following: Double,
      following_url: String,
      gists_url: String,
      gravatar_id: String,
      hireable: Boolean,
      html_url: String,
      id: Double,
      location: String,
      login: String,
      name: String,
      organizations_url: String,
      public_gists: Double,
      public_repos: Double,
      received_events_url: String,
      repos_url: String,
      site_admin: Boolean,
      starred_url: String,
      subscriptions_url: String,
      updated_at: js.Date,
      url: String
    ): User = {
      val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], bio = bio.asInstanceOf[js.Any], blog = blog.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], followers_url = followers_url.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], following_url = following_url.asInstanceOf[js.Any], gists_url = gists_url.asInstanceOf[js.Any], gravatar_id = gravatar_id.asInstanceOf[js.Any], hireable = hireable.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], organizations_url = organizations_url.asInstanceOf[js.Any], public_gists = public_gists.asInstanceOf[js.Any], public_repos = public_repos.asInstanceOf[js.Any], received_events_url = received_events_url.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], site_admin = site_admin.asInstanceOf[js.Any], starred_url = starred_url.asInstanceOf[js.Any], subscriptions_url = subscriptions_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("User")
      __obj.asInstanceOf[User]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: User] (val x: Self) extends AnyVal {
      
      inline def setBio(value: String): Self = StObject.set(x, "bio", value.asInstanceOf[js.Any])
      
      inline def setBlog(value: String): Self = StObject.set(x, "blog", value.asInstanceOf[js.Any])
      
      inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      inline def setCreated_at(value: js.Date): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setFollowers(value: Double): Self = StObject.set(x, "followers", value.asInstanceOf[js.Any])
      
      inline def setFollowing(value: Double): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
      
      inline def setHireable(value: Boolean): Self = StObject.set(x, "hireable", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPublic_gists(value: Double): Self = StObject.set(x, "public_gists", value.asInstanceOf[js.Any])
      
      inline def setPublic_repos(value: Double): Self = StObject.set(x, "public_repos", value.asInstanceOf[js.Any])
      
      inline def setUpdated_at(value: js.Date): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserOrOrg
    extends StObject
       with UserOrOrgSummary {
    
    var blog: String
    
    var company: String
    
    var created_at: js.Date
    
    var email: String
    
    var followers: Double
    
    var following: Double
    
    var location: String
    
    var name: String
    
    var public_gists: Double
    
    var public_repos: Double
    
    var updated_at: js.Date
  }
  object UserOrOrg {
    
    inline def apply(
      avatar_url: String,
      blog: String,
      company: String,
      created_at: js.Date,
      email: String,
      events_url: String,
      followers: Double,
      following: Double,
      id: Double,
      location: String,
      login: String,
      name: String,
      public_gists: Double,
      public_repos: Double,
      repos_url: String,
      `type`: typings.typedGithubApi.typedGithubApiStrings.User | typings.typedGithubApi.typedGithubApiStrings.Organization,
      updated_at: js.Date,
      url: String
    ): UserOrOrg = {
      val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], blog = blog.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], public_gists = public_gists.asInstanceOf[js.Any], public_repos = public_repos.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserOrOrg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserOrOrg] (val x: Self) extends AnyVal {
      
      inline def setBlog(value: String): Self = StObject.set(x, "blog", value.asInstanceOf[js.Any])
      
      inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      inline def setCreated_at(value: js.Date): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setFollowers(value: Double): Self = StObject.set(x, "followers", value.asInstanceOf[js.Any])
      
      inline def setFollowing(value: Double): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPublic_gists(value: Double): Self = StObject.set(x, "public_gists", value.asInstanceOf[js.Any])
      
      inline def setPublic_repos(value: Double): Self = StObject.set(x, "public_repos", value.asInstanceOf[js.Any])
      
      inline def setUpdated_at(value: js.Date): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserOrOrgSummary extends StObject {
    
    var avatar_url: String
    
    var events_url: String
    
    var id: Double
    
    var login: String
    
    var repos_url: String
    
    var `type`: typings.typedGithubApi.typedGithubApiStrings.User | typings.typedGithubApi.typedGithubApiStrings.Organization
    
    var url: String
  }
  object UserOrOrgSummary {
    
    inline def apply(
      avatar_url: String,
      events_url: String,
      id: Double,
      login: String,
      repos_url: String,
      `type`: typings.typedGithubApi.typedGithubApiStrings.User | typings.typedGithubApi.typedGithubApiStrings.Organization,
      url: String
    ): UserOrOrgSummary = {
      val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserOrOrgSummary]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserOrOrgSummary] (val x: Self) extends AnyVal {
      
      inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
      
      inline def setEvents_url(value: String): Self = StObject.set(x, "events_url", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
      
      inline def setRepos_url(value: String): Self = StObject.set(x, "repos_url", value.asInstanceOf[js.Any])
      
      inline def setType(
        value: typings.typedGithubApi.typedGithubApiStrings.User | typings.typedGithubApi.typedGithubApiStrings.Organization
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserSummary
    extends StObject
       with UserOrOrgSummary {
    
    var followers_url: String
    
    var following_url: String
    
    var gists_url: String
    
    var gravatar_id: String
    
    var html_url: String
    
    var organizations_url: String
    
    var received_events_url: String
    
    var site_admin: Boolean
    
    var starred_url: String
    
    var subscriptions_url: String
    
    @JSName("type")
    var type_UserSummary: typings.typedGithubApi.typedGithubApiStrings.User
  }
  object UserSummary {
    
    inline def apply(
      avatar_url: String,
      events_url: String,
      followers_url: String,
      following_url: String,
      gists_url: String,
      gravatar_id: String,
      html_url: String,
      id: Double,
      login: String,
      organizations_url: String,
      received_events_url: String,
      repos_url: String,
      site_admin: Boolean,
      starred_url: String,
      subscriptions_url: String,
      url: String
    ): UserSummary = {
      val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], followers_url = followers_url.asInstanceOf[js.Any], following_url = following_url.asInstanceOf[js.Any], gists_url = gists_url.asInstanceOf[js.Any], gravatar_id = gravatar_id.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], organizations_url = organizations_url.asInstanceOf[js.Any], received_events_url = received_events_url.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], site_admin = site_admin.asInstanceOf[js.Any], starred_url = starred_url.asInstanceOf[js.Any], subscriptions_url = subscriptions_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("User")
      __obj.asInstanceOf[UserSummary]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserSummary] (val x: Self) extends AnyVal {
      
      inline def setFollowers_url(value: String): Self = StObject.set(x, "followers_url", value.asInstanceOf[js.Any])
      
      inline def setFollowing_url(value: String): Self = StObject.set(x, "following_url", value.asInstanceOf[js.Any])
      
      inline def setGists_url(value: String): Self = StObject.set(x, "gists_url", value.asInstanceOf[js.Any])
      
      inline def setGravatar_id(value: String): Self = StObject.set(x, "gravatar_id", value.asInstanceOf[js.Any])
      
      inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
      
      inline def setOrganizations_url(value: String): Self = StObject.set(x, "organizations_url", value.asInstanceOf[js.Any])
      
      inline def setReceived_events_url(value: String): Self = StObject.set(x, "received_events_url", value.asInstanceOf[js.Any])
      
      inline def setSite_admin(value: Boolean): Self = StObject.set(x, "site_admin", value.asInstanceOf[js.Any])
      
      inline def setStarred_url(value: String): Self = StObject.set(x, "starred_url", value.asInstanceOf[js.Any])
      
      inline def setSubscriptions_url(value: String): Self = StObject.set(x, "subscriptions_url", value.asInstanceOf[js.Any])
      
      inline def setType(value: typings.typedGithubApi.typedGithubApiStrings.User): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
