package typings.tryghostContentApi

import typings.tryghostContentApi.mod.Author
import typings.tryghostContentApi.mod.Authors
import typings.tryghostContentApi.mod.BrowseFunction
import typings.tryghostContentApi.mod.Nullable
import typings.tryghostContentApi.mod.Params
import typings.tryghostContentApi.mod.PostOrPage
import typings.tryghostContentApi.mod.PostsOrPages
import typings.tryghostContentApi.mod.ReadFunction
import typings.tryghostContentApi.mod.SettingsResponse
import typings.tryghostContentApi.mod.Tag
import typings.tryghostContentApi.mod.Tags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Browse extends StObject {
    
    def browse(): js.Promise[PostsOrPages]
    def browse(options: Unit, memberToken: Nullable[String]): js.Promise[PostsOrPages]
    def browse(options: Params): js.Promise[PostsOrPages]
    def browse(options: Params, memberToken: Nullable[String]): js.Promise[PostsOrPages]
    @JSName("browse")
    var browse_Original: BrowseFunction[PostsOrPages]
    
    def read(data: Id): js.Promise[PostOrPage]
    def read(data: Id, options: Unit, memberToken: Nullable[String]): js.Promise[PostOrPage]
    def read(data: Id, options: Params): js.Promise[PostOrPage]
    def read(data: Id, options: Params, memberToken: Nullable[String]): js.Promise[PostOrPage]
    def read(data: Slug): js.Promise[PostOrPage]
    def read(data: Slug, options: Unit, memberToken: Nullable[String]): js.Promise[PostOrPage]
    def read(data: Slug, options: Params): js.Promise[PostOrPage]
    def read(data: Slug, options: Params, memberToken: Nullable[String]): js.Promise[PostOrPage]
    @JSName("read")
    var read_Original: ReadFunction[PostOrPage]
  }
  object Browse {
    
    @scala.inline
    def apply(
      browse: (/* options */ js.UndefOr[Params], /* memberToken */ js.UndefOr[Nullable[String]]) => js.Promise[PostsOrPages],
      read: (/* data */ Id | Slug, /* options */ js.UndefOr[Params], /* memberToken */ js.UndefOr[Nullable[String]]) => js.Promise[PostOrPage]
    ): Browse = {
      val __obj = js.Dynamic.literal(browse = js.Any.fromFunction2(browse), read = js.Any.fromFunction3(read))
      __obj.asInstanceOf[Browse]
    }
    
    @scala.inline
    implicit class BrowseMutableBuilder[Self <: Browse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowse(
        value: (/* options */ js.UndefOr[Params], /* memberToken */ js.UndefOr[Nullable[String]]) => js.Promise[PostsOrPages]
      ): Self = StObject.set(x, "browse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRead(
        value: (/* data */ Id | Slug, /* options */ js.UndefOr[Params], /* memberToken */ js.UndefOr[Nullable[String]]) => js.Promise[PostOrPage]
      ): Self = StObject.set(x, "read", js.Any.fromFunction3(value))
    }
  }
  
  trait BrowseBrowseFunction extends StObject {
    
    def browse(): js.Promise[SettingsResponse]
    def browse(options: Unit, memberToken: Nullable[String]): js.Promise[SettingsResponse]
    def browse(options: Params): js.Promise[SettingsResponse]
    def browse(options: Params, memberToken: Nullable[String]): js.Promise[SettingsResponse]
    @JSName("browse")
    var browse_Original: BrowseFunction[SettingsResponse]
  }
  object BrowseBrowseFunction {
    
    @scala.inline
    def apply(
      browse: (/* options */ js.UndefOr[Params], /* memberToken */ js.UndefOr[Nullable[String]]) => js.Promise[SettingsResponse]
    ): BrowseBrowseFunction = {
      val __obj = js.Dynamic.literal(browse = js.Any.fromFunction2(browse))
      __obj.asInstanceOf[BrowseBrowseFunction]
    }
    
    @scala.inline
    implicit class BrowseBrowseFunctionMutableBuilder[Self <: BrowseBrowseFunction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowse(
        value: (/* options */ js.UndefOr[Params], /* memberToken */ js.UndefOr[Nullable[String]]) => js.Promise[SettingsResponse]
      ): Self = StObject.set(x, "browse", js.Any.fromFunction2(value))
    }
  }
  
  trait BrowseRead extends StObject {
    
    def browse(): js.Promise[Tags]
    def browse(options: Unit, memberToken: Nullable[String]): js.Promise[Tags]
    def browse(options: Params): js.Promise[Tags]
    def browse(options: Params, memberToken: Nullable[String]): js.Promise[Tags]
    @JSName("browse")
    var browse_Original: BrowseFunction[Tags]
    
    def read(data: Id): js.Promise[Tag]
    def read(data: Id, options: Unit, memberToken: Nullable[String]): js.Promise[Tag]
    def read(data: Id, options: Params): js.Promise[Tag]
    def read(data: Id, options: Params, memberToken: Nullable[String]): js.Promise[Tag]
    def read(data: Slug): js.Promise[Tag]
    def read(data: Slug, options: Unit, memberToken: Nullable[String]): js.Promise[Tag]
    def read(data: Slug, options: Params): js.Promise[Tag]
    def read(data: Slug, options: Params, memberToken: Nullable[String]): js.Promise[Tag]
    @JSName("read")
    var read_Original: ReadFunction[Tag]
  }
  object BrowseRead {
    
    @scala.inline
    def apply(
      browse: (/* options */ js.UndefOr[Params], /* memberToken */ js.UndefOr[Nullable[String]]) => js.Promise[Tags],
      read: (/* data */ Id | Slug, /* options */ js.UndefOr[Params], /* memberToken */ js.UndefOr[Nullable[String]]) => js.Promise[Tag]
    ): BrowseRead = {
      val __obj = js.Dynamic.literal(browse = js.Any.fromFunction2(browse), read = js.Any.fromFunction3(read))
      __obj.asInstanceOf[BrowseRead]
    }
    
    @scala.inline
    implicit class BrowseReadMutableBuilder[Self <: BrowseRead] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowse(
        value: (/* options */ js.UndefOr[Params], /* memberToken */ js.UndefOr[Nullable[String]]) => js.Promise[Tags]
      ): Self = StObject.set(x, "browse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRead(
        value: (/* data */ Id | Slug, /* options */ js.UndefOr[Params], /* memberToken */ js.UndefOr[Nullable[String]]) => js.Promise[Tag]
      ): Self = StObject.set(x, "read", js.Any.fromFunction3(value))
    }
  }
  
  trait ErrorType extends StObject {
    
    var errorType: String
    
    var message: String
  }
  object ErrorType {
    
    @scala.inline
    def apply(errorType: String, message: String): ErrorType = {
      val __obj = js.Dynamic.literal(errorType = errorType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorType]
    }
    
    @scala.inline
    implicit class ErrorTypeMutableBuilder[Self <: ErrorType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorType(value: String): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: Nullable[String]
  }
  object Id {
    
    @scala.inline
    def apply(): Id = {
      val __obj = js.Dynamic.literal(id = null)
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Nullable[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdNull: Self = StObject.set(x, "id", null)
    }
  }
  
  trait Label extends StObject {
    
    var label: String
    
    var url: String
  }
  object Label {
    
    @scala.inline
    def apply(label: String, url: String): Label = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    @scala.inline
    implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pagination extends StObject {
    
    var pagination: typings.tryghostContentApi.mod.Pagination
  }
  object Pagination {
    
    @scala.inline
    def apply(pagination: typings.tryghostContentApi.mod.Pagination): Pagination = {
      val __obj = js.Dynamic.literal(pagination = pagination.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pagination]
    }
    
    @scala.inline
    implicit class PaginationMutableBuilder[Self <: Pagination] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPagination(value: typings.tryghostContentApi.mod.Pagination): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    }
  }
  
  trait Posts extends StObject {
    
    var posts: Double
  }
  object Posts {
    
    @scala.inline
    def apply(posts: Double): Posts = {
      val __obj = js.Dynamic.literal(posts = posts.asInstanceOf[js.Any])
      __obj.asInstanceOf[Posts]
    }
    
    @scala.inline
    implicit class PostsMutableBuilder[Self <: Posts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPosts(value: Double): Self = StObject.set(x, "posts", value.asInstanceOf[js.Any])
    }
  }
  
  trait Read extends StObject {
    
    def browse(): js.Promise[Authors]
    def browse(options: Unit, memberToken: Nullable[String]): js.Promise[Authors]
    def browse(options: Params): js.Promise[Authors]
    def browse(options: Params, memberToken: Nullable[String]): js.Promise[Authors]
    @JSName("browse")
    var browse_Original: BrowseFunction[Authors]
    
    def read(data: Id): js.Promise[Author]
    def read(data: Id, options: Unit, memberToken: Nullable[String]): js.Promise[Author]
    def read(data: Id, options: Params): js.Promise[Author]
    def read(data: Id, options: Params, memberToken: Nullable[String]): js.Promise[Author]
    def read(data: Slug): js.Promise[Author]
    def read(data: Slug, options: Unit, memberToken: Nullable[String]): js.Promise[Author]
    def read(data: Slug, options: Params): js.Promise[Author]
    def read(data: Slug, options: Params, memberToken: Nullable[String]): js.Promise[Author]
    @JSName("read")
    var read_Original: ReadFunction[Author]
  }
  object Read {
    
    @scala.inline
    def apply(
      browse: (/* options */ js.UndefOr[Params], /* memberToken */ js.UndefOr[Nullable[String]]) => js.Promise[Authors],
      read: (/* data */ Id | Slug, /* options */ js.UndefOr[Params], /* memberToken */ js.UndefOr[Nullable[String]]) => js.Promise[Author]
    ): Read = {
      val __obj = js.Dynamic.literal(browse = js.Any.fromFunction2(browse), read = js.Any.fromFunction3(read))
      __obj.asInstanceOf[Read]
    }
    
    @scala.inline
    implicit class ReadMutableBuilder[Self <: Read] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowse(
        value: (/* options */ js.UndefOr[Params], /* memberToken */ js.UndefOr[Nullable[String]]) => js.Promise[Authors]
      ): Self = StObject.set(x, "browse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRead(
        value: (/* data */ Id | Slug, /* options */ js.UndefOr[Params], /* memberToken */ js.UndefOr[Nullable[String]]) => js.Promise[Author]
      ): Self = StObject.set(x, "read", js.Any.fromFunction3(value))
    }
  }
  
  trait Slug extends StObject {
    
    var slug: Nullable[String]
  }
  object Slug {
    
    @scala.inline
    def apply(): Slug = {
      val __obj = js.Dynamic.literal(slug = null)
      __obj.asInstanceOf[Slug]
    }
    
    @scala.inline
    implicit class SlugMutableBuilder[Self <: Slug] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSlug(value: Nullable[String]): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlugNull: Self = StObject.set(x, "slug", null)
    }
  }
}
