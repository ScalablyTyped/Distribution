package typings.wordpressApiFetch

import typings.wordpressApiFetch.mod.Schema.Context
import typings.wordpressApiFetch.mod.Schema.EmbedKeys.Block
import typings.wordpressApiFetch.mod.Schema.EmbedKeys.Category
import typings.wordpressApiFetch.mod.Schema.EmbedKeys.Comment
import typings.wordpressApiFetch.mod.Schema.EmbedKeys.Media
import typings.wordpressApiFetch.mod.Schema.EmbedKeys.Page
import typings.wordpressApiFetch.mod.Schema.EmbedKeys.Post
import typings.wordpressApiFetch.mod.Schema.EmbedKeys.PostRevision
import typings.wordpressApiFetch.mod.Schema.EmbedKeys.Status
import typings.wordpressApiFetch.mod.Schema.EmbedKeys.Tag
import typings.wordpressApiFetch.mod.Schema.EmbedKeys.Taxonomy
import typings.wordpressApiFetch.mod.Schema.EmbedKeys.Type
import typings.wordpressApiFetch.mod.Schema.EmbedKeys.User
import typings.wordpressApiFetch.mod.Schema.OpenOrClosed
import typings.wordpressApiFetch.mod.Schema.PostFormat
import typings.wordpressApiFetch.mod.Schema.PostStatus
import typings.wordpressApiFetch.mod.Schema.TaxonomyKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wordpressApiFetchStrings {
  
  @js.native
  sealed trait Decontextualize extends StObject
  inline def Decontextualize: Decontextualize = "Decontextualize".asInstanceOf[Decontextualize]
  
  @js.native
  sealed trait _embedded
    extends StObject
       with Block
       with Category
       with Comment
       with Media
       with Page
       with Post
       with PostRevision
       with Status
       with Tag
       with Taxonomy
       with Type
       with User
  inline def _embedded: _embedded = "_embedded".asInstanceOf[_embedded]
  
  @js.native
  sealed trait _links
    extends StObject
       with Block
       with Category
       with Comment
       with Media
       with Page
       with Post
       with PostRevision
       with Status
       with Tag
       with Taxonomy
       with Type
       with User
  inline def _links: _links = "_links".asInstanceOf[_links]
  
  @js.native
  sealed trait alt_text
    extends StObject
       with Media
  inline def alt_text: alt_text = "alt_text".asInstanceOf[alt_text]
  
  @js.native
  sealed trait approved extends StObject
  inline def approved: approved = "approved".asInstanceOf[approved]
  
  @js.native
  sealed trait aside
    extends StObject
       with PostFormat
  inline def aside: aside = "aside".asInstanceOf[aside]
  
  @js.native
  sealed trait audio
    extends StObject
       with PostFormat
  inline def audio: audio = "audio".asInstanceOf[audio]
  
  @js.native
  sealed trait author
    extends StObject
       with Comment
       with Media
       with Page
       with Post
       with PostRevision
  inline def author: author = "author".asInstanceOf[author]
  
  @js.native
  sealed trait author_avatar_urls
    extends StObject
       with Comment
  inline def author_avatar_urls: author_avatar_urls = "author_avatar_urls".asInstanceOf[author_avatar_urls]
  
  @js.native
  sealed trait author_name
    extends StObject
       with Comment
  inline def author_name: author_name = "author_name".asInstanceOf[author_name]
  
  @js.native
  sealed trait author_url
    extends StObject
       with Comment
  inline def author_url: author_url = "author_url".asInstanceOf[author_url]
  
  @js.native
  sealed trait avatar_urls
    extends StObject
       with User
  inline def avatar_urls: avatar_urls = "avatar_urls".asInstanceOf[avatar_urls]
  
  @js.native
  sealed trait caption
    extends StObject
       with Media
  inline def caption: caption = "caption".asInstanceOf[caption]
  
  @js.native
  sealed trait categories
    extends StObject
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
  inline def categories: categories = "categories".asInstanceOf[categories]
  
  @js.native
  sealed trait category
    extends StObject
       with TaxonomyKind
  inline def category: category = "category".asInstanceOf[category]
  
  @js.native
  sealed trait chat
    extends StObject
       with PostFormat
  inline def chat: chat = "chat".asInstanceOf[chat]
  
  @js.native
  sealed trait closed
    extends StObject
       with OpenOrClosed
  inline def closed: closed = "closed".asInstanceOf[closed]
  
  @js.native
  sealed trait comment_status
    extends StObject
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
  inline def comment_status: comment_status = "comment_status".asInstanceOf[comment_status]
  
  @js.native
  sealed trait content
    extends StObject
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Block
       with Comment
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.PostRevision
  inline def content: content = "content".asInstanceOf[content]
  
  @js.native
  sealed trait count
    extends StObject
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Category
  inline def count: count = "count".asInstanceOf[count]
  
  @js.native
  sealed trait date
    extends StObject
       with Block
       with Comment
       with Media
       with Page
       with Post
       with PostRevision
  inline def date: date = "date".asInstanceOf[date]
  
  @js.native
  sealed trait date_gmt
    extends StObject
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Block
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Comment
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.PostRevision
  inline def date_gmt: date_gmt = "date_gmt".asInstanceOf[date_gmt]
  
  @js.native
  sealed trait description
    extends StObject
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Category
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Taxonomy
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Type
       with User
  inline def description: description = "description".asInstanceOf[description]
  
  @js.native
  sealed trait draft
    extends StObject
       with PostStatus
  inline def draft: draft = "draft".asInstanceOf[draft]
  
  @js.native
  sealed trait edit
    extends StObject
       with Context
  inline def edit: edit = "edit".asInstanceOf[edit]
  
  @js.native
  sealed trait embed
    extends StObject
       with Context
  inline def embed: embed = "embed".asInstanceOf[embed]
  
  @js.native
  sealed trait excerpt
    extends StObject
       with Page
       with Post
       with PostRevision
  inline def excerpt: excerpt = "excerpt".asInstanceOf[excerpt]
  
  @js.native
  sealed trait featured_media
    extends StObject
       with Page
       with Post
  inline def featured_media: featured_media = "featured_media".asInstanceOf[featured_media]
  
  @js.native
  sealed trait file extends StObject
  inline def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait format
    extends StObject
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
  inline def format: format = "format".asInstanceOf[format]
  
  @js.native
  sealed trait future
    extends StObject
       with PostStatus
  inline def future: future = "future".asInstanceOf[future]
  
  @js.native
  sealed trait gallery
    extends StObject
       with PostFormat
  inline def gallery: gallery = "gallery".asInstanceOf[gallery]
  
  @js.native
  sealed trait guid
    extends StObject
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Block
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.PostRevision
  inline def guid: guid = "guid".asInstanceOf[guid]
  
  @js.native
  sealed trait hierarchical
    extends StObject
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Taxonomy
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Type
  inline def hierarchical: hierarchical = "hierarchical".asInstanceOf[hierarchical]
  
  @js.native
  sealed trait hold extends StObject
  inline def hold: hold = "hold".asInstanceOf[hold]
  
  @js.native
  sealed trait id
    extends StObject
       with Block
       with Category
       with Comment
       with Media
       with Page
       with Post
       with PostRevision
       with Tag
       with User
  inline def id: id = "id".asInstanceOf[id]
  
  @js.native
  sealed trait image
    extends StObject
       with PostFormat
  inline def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait inherit extends StObject
  inline def inherit: inherit = "inherit".asInstanceOf[inherit]
  
  @js.native
  sealed trait link
    extends StObject
       with Block
       with Category
       with Comment
       with Media
       with Page
       with Post
       with PostFormat
       with Tag
       with User
  inline def link: link = "link".asInstanceOf[link]
  
  @js.native
  sealed trait link_category
    extends StObject
       with TaxonomyKind
  inline def link_category: link_category = "link_category".asInstanceOf[link_category]
  
  @js.native
  sealed trait media_details
    extends StObject
       with Media
  inline def media_details: media_details = "media_details".asInstanceOf[media_details]
  
  @js.native
  sealed trait media_type
    extends StObject
       with Media
  inline def media_type: media_type = "media_type".asInstanceOf[media_type]
  
  @js.native
  sealed trait menu_order
    extends StObject
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
  inline def menu_order: menu_order = "menu_order".asInstanceOf[menu_order]
  
  @js.native
  sealed trait meta
    extends StObject
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Category
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Comment
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.User
  inline def meta: meta = "meta".asInstanceOf[meta]
  
  @js.native
  sealed trait mime_type
    extends StObject
       with Media
  inline def mime_type: mime_type = "mime_type".asInstanceOf[mime_type]
  
  @js.native
  sealed trait modified
    extends StObject
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Block
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.PostRevision
  inline def modified: modified = "modified".asInstanceOf[modified]
  
  @js.native
  sealed trait modified_gmt
    extends StObject
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Block
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.PostRevision
  inline def modified_gmt: modified_gmt = "modified_gmt".asInstanceOf[modified_gmt]
  
  @js.native
  sealed trait name
    extends StObject
       with Category
       with Status
       with Tag
       with Taxonomy
       with Type
       with User
  inline def name: name = "name".asInstanceOf[name]
  
  @js.native
  sealed trait nav_menu
    extends StObject
       with TaxonomyKind
  inline def nav_menu: nav_menu = "nav_menu".asInstanceOf[nav_menu]
  
  @js.native
  sealed trait open
    extends StObject
       with OpenOrClosed
  inline def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait parent
    extends StObject
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Category
       with Comment
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with PostRevision
  inline def parent: parent = "parent".asInstanceOf[parent]
  
  @js.native
  sealed trait pending
    extends StObject
       with PostStatus
  inline def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait ping_status
    extends StObject
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
  inline def ping_status: ping_status = "ping_status".asInstanceOf[ping_status]
  
  @js.native
  sealed trait post
    extends StObject
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Comment
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
  inline def post: post = "post".asInstanceOf[post]
  
  @js.native
  sealed trait post_format
    extends StObject
       with TaxonomyKind
  inline def post_format: post_format = "post_format".asInstanceOf[post_format]
  
  @js.native
  sealed trait post_tag
    extends StObject
       with TaxonomyKind
  inline def post_tag: post_tag = "post_tag".asInstanceOf[post_tag]
  
  @js.native
  sealed trait `private`
    extends StObject
       with PostStatus
  inline def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait public
    extends StObject
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Status
  inline def public: public = "public".asInstanceOf[public]
  
  @js.native
  sealed trait publish
    extends StObject
       with PostStatus
  inline def publish: publish = "publish".asInstanceOf[publish]
  
  @js.native
  sealed trait queryable
    extends StObject
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Status
  inline def queryable: queryable = "queryable".asInstanceOf[queryable]
  
  @js.native
  sealed trait quote
    extends StObject
       with PostFormat
  inline def quote: quote = "quote".asInstanceOf[quote]
  
  @js.native
  sealed trait rest_base
    extends StObject
       with Taxonomy
       with Type
  inline def rest_base: rest_base = "rest_base".asInstanceOf[rest_base]
  
  @js.native
  sealed trait slug
    extends StObject
       with Block
       with Category
       with Media
       with Page
       with Post
       with PostRevision
       with Status
       with Tag
       with Taxonomy
       with Type
       with User
  inline def slug: slug = "slug".asInstanceOf[slug]
  
  @js.native
  sealed trait source_url
    extends StObject
       with Media
  inline def source_url: source_url = "source_url".asInstanceOf[source_url]
  
  @js.native
  sealed trait spam extends StObject
  inline def spam: spam = "spam".asInstanceOf[spam]
  
  @js.native
  sealed trait standard
    extends StObject
       with PostFormat
  inline def standard: standard = "standard".asInstanceOf[standard]
  
  @js.native
  sealed trait status
    extends StObject
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Block
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Comment
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
       with PostFormat
  inline def status: status = "status".asInstanceOf[status]
  
  @js.native
  sealed trait sticky
    extends StObject
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
  inline def sticky: sticky = "sticky".asInstanceOf[sticky]
  
  @js.native
  sealed trait tags
    extends StObject
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
  inline def tags: tags = "tags".asInstanceOf[tags]
  
  @js.native
  sealed trait taxonomies
    extends StObject
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Type
  inline def taxonomies: taxonomies = "taxonomies".asInstanceOf[taxonomies]
  
  @js.native
  sealed trait taxonomy
    extends StObject
       with Category
       with Tag
  inline def taxonomy: taxonomy = "taxonomy".asInstanceOf[taxonomy]
  
  @js.native
  sealed trait template
    extends StObject
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Block
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
  inline def template: template = "template".asInstanceOf[template]
  
  @js.native
  sealed trait title
    extends StObject
       with Block
       with Media
       with Page
       with Post
       with PostRevision
  inline def title: title = "title".asInstanceOf[title]
  
  @js.native
  sealed trait trash extends StObject
  inline def trash: trash = "trash".asInstanceOf[trash]
  
  @js.native
  sealed trait `type`
    extends StObject
       with Block
       with Comment
       with Media
       with Page
       with Post
  inline def `type`: `type` = "type".asInstanceOf[`type`]
  
  @js.native
  sealed trait types
    extends StObject
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Taxonomy
  inline def types: types = "types".asInstanceOf[types]
  
  @js.native
  sealed trait url
    extends StObject
       with User
  inline def url: url = "url".asInstanceOf[url]
  
  @js.native
  sealed trait video
    extends StObject
       with PostFormat
  inline def video: video = "video".asInstanceOf[video]
  
  @js.native
  sealed trait view
    extends StObject
       with Context
  inline def view: view = "view".asInstanceOf[view]
}
