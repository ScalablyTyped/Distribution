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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Browse extends StObject {
    
    def browse(): js.Promise[PostsOrPages] = js.native
    def browse(options: js.UndefOr[scala.Nothing], memberToken: Nullable[String]): js.Promise[PostsOrPages] = js.native
    def browse(options: Params): js.Promise[PostsOrPages] = js.native
    def browse(options: Params, memberToken: Nullable[String]): js.Promise[PostsOrPages] = js.native
    @JSName("browse")
    var browse_Original: BrowseFunction[PostsOrPages] = js.native
    
    def read(data: Id): js.Promise[PostOrPage] = js.native
    def read(data: Id, options: js.UndefOr[scala.Nothing], memberToken: Nullable[String]): js.Promise[PostOrPage] = js.native
    def read(data: Id, options: Params): js.Promise[PostOrPage] = js.native
    def read(data: Id, options: Params, memberToken: Nullable[String]): js.Promise[PostOrPage] = js.native
    def read(data: Slug): js.Promise[PostOrPage] = js.native
    def read(data: Slug, options: js.UndefOr[scala.Nothing], memberToken: Nullable[String]): js.Promise[PostOrPage] = js.native
    def read(data: Slug, options: Params): js.Promise[PostOrPage] = js.native
    def read(data: Slug, options: Params, memberToken: Nullable[String]): js.Promise[PostOrPage] = js.native
    @JSName("read")
    var read_Original: ReadFunction[PostOrPage] = js.native
  }
  
  @js.native
  trait BrowseBrowseFunction extends StObject {
    
    def browse(): js.Promise[SettingsResponse] = js.native
    def browse(options: js.UndefOr[scala.Nothing], memberToken: Nullable[String]): js.Promise[SettingsResponse] = js.native
    def browse(options: Params): js.Promise[SettingsResponse] = js.native
    def browse(options: Params, memberToken: Nullable[String]): js.Promise[SettingsResponse] = js.native
    @JSName("browse")
    var browse_Original: BrowseFunction[SettingsResponse] = js.native
  }
  
  @js.native
  trait BrowseRead extends StObject {
    
    def browse(): js.Promise[Tags] = js.native
    def browse(options: js.UndefOr[scala.Nothing], memberToken: Nullable[String]): js.Promise[Tags] = js.native
    def browse(options: Params): js.Promise[Tags] = js.native
    def browse(options: Params, memberToken: Nullable[String]): js.Promise[Tags] = js.native
    @JSName("browse")
    var browse_Original: BrowseFunction[Tags] = js.native
    
    def read(data: Id): js.Promise[Tag] = js.native
    def read(data: Id, options: js.UndefOr[scala.Nothing], memberToken: Nullable[String]): js.Promise[Tag] = js.native
    def read(data: Id, options: Params): js.Promise[Tag] = js.native
    def read(data: Id, options: Params, memberToken: Nullable[String]): js.Promise[Tag] = js.native
    def read(data: Slug): js.Promise[Tag] = js.native
    def read(data: Slug, options: js.UndefOr[scala.Nothing], memberToken: Nullable[String]): js.Promise[Tag] = js.native
    def read(data: Slug, options: Params): js.Promise[Tag] = js.native
    def read(data: Slug, options: Params, memberToken: Nullable[String]): js.Promise[Tag] = js.native
    @JSName("read")
    var read_Original: ReadFunction[Tag] = js.native
  }
  
  @js.native
  trait ErrorType extends StObject {
    
    var errorType: String = js.native
    
    var message: String = js.native
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
  
  @js.native
  trait Id extends StObject {
    
    var id: Nullable[String] = js.native
  }
  object Id {
    
    @scala.inline
    def apply(): Id = {
      val __obj = js.Dynamic.literal()
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
  
  @js.native
  trait Label extends StObject {
    
    var label: String = js.native
    
    var url: String = js.native
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
  
  @js.native
  trait Pagination extends StObject {
    
    var pagination: typings.tryghostContentApi.mod.Pagination = js.native
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
  
  @js.native
  trait Posts extends StObject {
    
    var posts: Double = js.native
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
  
  @js.native
  trait Read extends StObject {
    
    def browse(): js.Promise[Authors] = js.native
    def browse(options: js.UndefOr[scala.Nothing], memberToken: Nullable[String]): js.Promise[Authors] = js.native
    def browse(options: Params): js.Promise[Authors] = js.native
    def browse(options: Params, memberToken: Nullable[String]): js.Promise[Authors] = js.native
    @JSName("browse")
    var browse_Original: BrowseFunction[Authors] = js.native
    
    def read(data: Id): js.Promise[Author] = js.native
    def read(data: Id, options: js.UndefOr[scala.Nothing], memberToken: Nullable[String]): js.Promise[Author] = js.native
    def read(data: Id, options: Params): js.Promise[Author] = js.native
    def read(data: Id, options: Params, memberToken: Nullable[String]): js.Promise[Author] = js.native
    def read(data: Slug): js.Promise[Author] = js.native
    def read(data: Slug, options: js.UndefOr[scala.Nothing], memberToken: Nullable[String]): js.Promise[Author] = js.native
    def read(data: Slug, options: Params): js.Promise[Author] = js.native
    def read(data: Slug, options: Params, memberToken: Nullable[String]): js.Promise[Author] = js.native
    @JSName("read")
    var read_Original: ReadFunction[Author] = js.native
  }
  
  @js.native
  trait Slug extends StObject {
    
    var slug: Nullable[String] = js.native
  }
  object Slug {
    
    @scala.inline
    def apply(): Slug = {
      val __obj = js.Dynamic.literal()
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
