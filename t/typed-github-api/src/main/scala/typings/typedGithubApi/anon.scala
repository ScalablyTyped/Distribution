package typings.typedGithubApi

import typings.typedGithubApi.typedGithubApiStrings.modified
import typings.typedGithubApi.typedGithubApiStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Additions extends StObject {
    
    var additions: Double
    
    var deletions: Double
    
    var total: Double
  }
  object Additions {
    
    inline def apply(additions: Double, deletions: Double, total: Double): Additions = {
      val __obj = js.Dynamic.literal(additions = additions.asInstanceOf[js.Any], deletions = deletions.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Additions]
    }
    
    extension [Self <: Additions](x: Self) {
      
      inline def setAdditions(value: Double): Self = StObject.set(x, "additions", value.asInstanceOf[js.Any])
      
      inline def setDeletions(value: Double): Self = StObject.set(x, "deletions", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait Admin extends StObject {
    
    var admin: Boolean
    
    var pull: Boolean
    
    var push: Boolean
  }
  object Admin {
    
    inline def apply(admin: Boolean, pull: Boolean, push: Boolean): Admin = {
      val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], pull = pull.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any])
      __obj.asInstanceOf[Admin]
    }
    
    extension [Self <: Admin](x: Self) {
      
      inline def setAdmin(value: Boolean): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
      
      inline def setPull(value: Boolean): Self = StObject.set(x, "pull", value.asInstanceOf[js.Any])
      
      inline def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    }
  }
  
  trait Bloburl extends StObject {
    
    var additions: Double
    
    var blob_url: String
    
    var changes: Double
    
    var deletions: Double
    
    var filename: String
    
    var patch: String
    
    var raw_url: String
    
    var status: modified
  }
  object Bloburl {
    
    inline def apply(
      additions: Double,
      blob_url: String,
      changes: Double,
      deletions: Double,
      filename: String,
      patch: String,
      raw_url: String
    ): Bloburl = {
      val __obj = js.Dynamic.literal(additions = additions.asInstanceOf[js.Any], blob_url = blob_url.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], deletions = deletions.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], raw_url = raw_url.asInstanceOf[js.Any], status = "modified")
      __obj.asInstanceOf[Bloburl]
    }
    
    extension [Self <: Bloburl](x: Self) {
      
      inline def setAdditions(value: Double): Self = StObject.set(x, "additions", value.asInstanceOf[js.Any])
      
      inline def setBlob_url(value: String): Self = StObject.set(x, "blob_url", value.asInstanceOf[js.Any])
      
      inline def setChanges(value: Double): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      inline def setDeletions(value: Double): Self = StObject.set(x, "deletions", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setPatch(value: String): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      inline def setRaw_url(value: String): Self = StObject.set(x, "raw_url", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: modified): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Body extends StObject {
    
    var body: From
    
    var title: From
  }
  object Body {
    
    inline def apply(body: From, title: From): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setBody(value: From): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: From): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait Collaborators extends StObject {
    
    var collaborators: Double
    
    var name: String
    
    var private_repos: Double
    
    var space: Double
  }
  object Collaborators {
    
    inline def apply(collaborators: Double, name: String, private_repos: Double, space: Double): Collaborators = {
      val __obj = js.Dynamic.literal(collaborators = collaborators.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], private_repos = private_repos.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any])
      __obj.asInstanceOf[Collaborators]
    }
    
    extension [Self <: Collaborators](x: Self) {
      
      inline def setCollaborators(value: Double): Self = StObject.set(x, "collaborators", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrivate_repos(value: Double): Self = StObject.set(x, "private_repos", value.asInstanceOf[js.Any])
      
      inline def setSpace(value: Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    }
  }
  
  trait From extends StObject {
    
    var from: String
  }
  object From {
    
    inline def apply(from: String): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    extension [Self <: From](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    }
  }
  
  trait Html extends StObject {
    
    var html: String
    
    var self: String
  }
  object Html {
    
    inline def apply(html: String, self: String): Html = {
      val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
      __obj.asInstanceOf[Html]
    }
    
    extension [Self <: Html](x: Self) {
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setSelf(value: String): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var collaborators: Double
    
    var name: String
    
    var privateRepos: Double
    
    var space: Double
  }
  object Name {
    
    inline def apply(collaborators: Double, name: String, privateRepos: Double, space: Double): Name = {
      val __obj = js.Dynamic.literal(collaborators = collaborators.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], privateRepos = privateRepos.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setCollaborators(value: Double): Self = StObject.set(x, "collaborators", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrivateRepos(value: Double): Self = StObject.set(x, "privateRepos", value.asInstanceOf[js.Any])
      
      inline def setSpace(value: Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    }
  }
  
  trait Payload extends StObject {
    
    var payload: String
    
    var reason: valid
    
    var signature: String
    
    var verified: Boolean
  }
  object Payload {
    
    inline def apply(payload: String, signature: String, verified: Boolean): Payload = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], reason = "valid", signature = signature.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
      __obj.asInstanceOf[Payload]
    }
    
    extension [Self <: Payload](x: Self) {
      
      inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setReason(value: valid): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    }
  }
}
