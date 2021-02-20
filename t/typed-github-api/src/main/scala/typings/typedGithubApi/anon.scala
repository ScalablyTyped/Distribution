package typings.typedGithubApi

import typings.typedGithubApi.typedGithubApiStrings.modified
import typings.typedGithubApi.typedGithubApiStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Additions extends StObject {
    
    var additions: Double = js.native
    
    var deletions: Double = js.native
    
    var total: Double = js.native
  }
  object Additions {
    
    @scala.inline
    def apply(additions: Double, deletions: Double, total: Double): Additions = {
      val __obj = js.Dynamic.literal(additions = additions.asInstanceOf[js.Any], deletions = deletions.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Additions]
    }
    
    @scala.inline
    implicit class AdditionsMutableBuilder[Self <: Additions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditions(value: Double): Self = StObject.set(x, "additions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletions(value: Double): Self = StObject.set(x, "deletions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Admin extends StObject {
    
    var admin: Boolean = js.native
    
    var pull: Boolean = js.native
    
    var push: Boolean = js.native
  }
  object Admin {
    
    @scala.inline
    def apply(admin: Boolean, pull: Boolean, push: Boolean): Admin = {
      val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], pull = pull.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any])
      __obj.asInstanceOf[Admin]
    }
    
    @scala.inline
    implicit class AdminMutableBuilder[Self <: Admin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdmin(value: Boolean): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPull(value: Boolean): Self = StObject.set(x, "pull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Bloburl extends StObject {
    
    var additions: Double = js.native
    
    var blob_url: String = js.native
    
    var changes: Double = js.native
    
    var deletions: Double = js.native
    
    var filename: String = js.native
    
    var patch: String = js.native
    
    var raw_url: String = js.native
    
    var status: modified = js.native
  }
  object Bloburl {
    
    @scala.inline
    def apply(
      additions: Double,
      blob_url: String,
      changes: Double,
      deletions: Double,
      filename: String,
      patch: String,
      raw_url: String,
      status: modified
    ): Bloburl = {
      val __obj = js.Dynamic.literal(additions = additions.asInstanceOf[js.Any], blob_url = blob_url.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], deletions = deletions.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], raw_url = raw_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bloburl]
    }
    
    @scala.inline
    implicit class BloburlMutableBuilder[Self <: Bloburl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditions(value: Double): Self = StObject.set(x, "additions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlob_url(value: String): Self = StObject.set(x, "blob_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChanges(value: Double): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletions(value: Double): Self = StObject.set(x, "deletions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatch(value: String): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw_url(value: String): Self = StObject.set(x, "raw_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: modified): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Body extends StObject {
    
    var body: From = js.native
    
    var title: From = js.native
  }
  object Body {
    
    @scala.inline
    def apply(body: From, title: From): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    @scala.inline
    implicit class BodyMutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: From): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: From): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Collaborators extends StObject {
    
    var collaborators: Double = js.native
    
    var name: String = js.native
    
    var private_repos: Double = js.native
    
    var space: Double = js.native
  }
  object Collaborators {
    
    @scala.inline
    def apply(collaborators: Double, name: String, private_repos: Double, space: Double): Collaborators = {
      val __obj = js.Dynamic.literal(collaborators = collaborators.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], private_repos = private_repos.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any])
      __obj.asInstanceOf[Collaborators]
    }
    
    @scala.inline
    implicit class CollaboratorsMutableBuilder[Self <: Collaborators] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollaborators(value: Double): Self = StObject.set(x, "collaborators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivate_repos(value: Double): Self = StObject.set(x, "private_repos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpace(value: Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait From extends StObject {
    
    var from: String = js.native
  }
  object From {
    
    @scala.inline
    def apply(from: String): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    @scala.inline
    implicit class FromMutableBuilder[Self <: From] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Html extends StObject {
    
    var html: String = js.native
    
    var self: String = js.native
  }
  object Html {
    
    @scala.inline
    def apply(html: String, self: String): Html = {
      val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
      __obj.asInstanceOf[Html]
    }
    
    @scala.inline
    implicit class HtmlMutableBuilder[Self <: Html] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelf(value: String): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var collaborators: Double = js.native
    
    var name: String = js.native
    
    var privateRepos: Double = js.native
    
    var space: Double = js.native
  }
  object Name {
    
    @scala.inline
    def apply(collaborators: Double, name: String, privateRepos: Double, space: Double): Name = {
      val __obj = js.Dynamic.literal(collaborators = collaborators.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], privateRepos = privateRepos.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollaborators(value: Double): Self = StObject.set(x, "collaborators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateRepos(value: Double): Self = StObject.set(x, "privateRepos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpace(value: Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Payload extends StObject {
    
    var payload: String = js.native
    
    var reason: valid = js.native
    
    var signature: String = js.native
    
    var verified: Boolean = js.native
  }
  object Payload {
    
    @scala.inline
    def apply(payload: String, reason: valid, signature: String, verified: Boolean): Payload = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
      __obj.asInstanceOf[Payload]
    }
    
    @scala.inline
    implicit class PayloadMutableBuilder[Self <: Payload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: valid): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    }
  }
}
