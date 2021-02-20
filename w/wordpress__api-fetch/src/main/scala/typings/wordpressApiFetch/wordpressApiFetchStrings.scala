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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wordpressApiFetchStrings {
  
  @js.native
  sealed trait Decontextualize extends StObject
  @scala.inline
  def Decontextualize: Decontextualize = "Decontextualize".asInstanceOf[Decontextualize]
  
  @js.native
  sealed trait _embedded
    extends Block
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
  @scala.inline
  def _embedded: _embedded = "_embedded".asInstanceOf[_embedded]
  
  @js.native
  sealed trait _links
    extends Block
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
  @scala.inline
  def _links: _links = "_links".asInstanceOf[_links]
  
  @js.native
  sealed trait alt_text extends Media
  @scala.inline
  def alt_text: alt_text = "alt_text".asInstanceOf[alt_text]
  
  @js.native
  sealed trait approved extends StObject
  @scala.inline
  def approved: approved = "approved".asInstanceOf[approved]
  
  @js.native
  sealed trait aside extends PostFormat
  @scala.inline
  def aside: aside = "aside".asInstanceOf[aside]
  
  @js.native
  sealed trait audio extends PostFormat
  @scala.inline
  def audio: audio = "audio".asInstanceOf[audio]
  
  @js.native
  sealed trait author
    extends Comment
       with Media
       with Page
       with Post
       with PostRevision
  @scala.inline
  def author: author = "author".asInstanceOf[author]
  
  @js.native
  sealed trait author_avatar_urls extends Comment
  @scala.inline
  def author_avatar_urls: author_avatar_urls = "author_avatar_urls".asInstanceOf[author_avatar_urls]
  
  @js.native
  sealed trait author_name extends Comment
  @scala.inline
  def author_name: author_name = "author_name".asInstanceOf[author_name]
  
  @js.native
  sealed trait author_url extends Comment
  @scala.inline
  def author_url: author_url = "author_url".asInstanceOf[author_url]
  
  @js.native
  sealed trait avatar_urls extends User
  @scala.inline
  def avatar_urls: avatar_urls = "avatar_urls".asInstanceOf[avatar_urls]
  
  @js.native
  sealed trait caption extends Media
  @scala.inline
  def caption: caption = "caption".asInstanceOf[caption]
  
  @js.native
  sealed trait categories
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
  @scala.inline
  def categories: categories = "categories".asInstanceOf[categories]
  
  @js.native
  sealed trait category extends TaxonomyKind
  @scala.inline
  def category: category = "category".asInstanceOf[category]
  
  @js.native
  sealed trait chat extends PostFormat
  @scala.inline
  def chat: chat = "chat".asInstanceOf[chat]
  
  @js.native
  sealed trait closed extends OpenOrClosed
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  
  @js.native
  sealed trait comment_status
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
  @scala.inline
  def comment_status: comment_status = "comment_status".asInstanceOf[comment_status]
  
  @js.native
  sealed trait content
    extends Comment
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Block
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.PostRevision
  @scala.inline
  def content: content = "content".asInstanceOf[content]
  
  @js.native
  sealed trait count
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Category
  @scala.inline
  def count: count = "count".asInstanceOf[count]
  
  @js.native
  sealed trait date
    extends Block
       with Comment
       with Media
       with Page
       with Post
       with PostRevision
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  
  @js.native
  sealed trait date_gmt
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Block
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Comment
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.PostRevision
  @scala.inline
  def date_gmt: date_gmt = "date_gmt".asInstanceOf[date_gmt]
  
  @js.native
  sealed trait description
    extends User
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Category
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Taxonomy
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Type
  @scala.inline
  def description: description = "description".asInstanceOf[description]
  
  @js.native
  sealed trait draft extends PostStatus
  @scala.inline
  def draft: draft = "draft".asInstanceOf[draft]
  
  @js.native
  sealed trait edit extends Context
  @scala.inline
  def edit: edit = "edit".asInstanceOf[edit]
  
  @js.native
  sealed trait embed extends Context
  @scala.inline
  def embed: embed = "embed".asInstanceOf[embed]
  
  @js.native
  sealed trait excerpt
    extends Page
       with Post
       with PostRevision
  @scala.inline
  def excerpt: excerpt = "excerpt".asInstanceOf[excerpt]
  
  @js.native
  sealed trait featured_media
    extends Page
       with Post
  @scala.inline
  def featured_media: featured_media = "featured_media".asInstanceOf[featured_media]
  
  @js.native
  sealed trait file extends StObject
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait format
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
  @scala.inline
  def format: format = "format".asInstanceOf[format]
  
  @js.native
  sealed trait future extends PostStatus
  @scala.inline
  def future: future = "future".asInstanceOf[future]
  
  @js.native
  sealed trait gallery extends PostFormat
  @scala.inline
  def gallery: gallery = "gallery".asInstanceOf[gallery]
  
  @js.native
  sealed trait guid
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Block
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.PostRevision
  @scala.inline
  def guid: guid = "guid".asInstanceOf[guid]
  
  @js.native
  sealed trait hierarchical
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Taxonomy
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Type
  @scala.inline
  def hierarchical: hierarchical = "hierarchical".asInstanceOf[hierarchical]
  
  @js.native
  sealed trait hold extends StObject
  @scala.inline
  def hold: hold = "hold".asInstanceOf[hold]
  
  @js.native
  sealed trait id
    extends Block
       with Category
       with Comment
       with Media
       with Page
       with Post
       with PostRevision
       with Tag
       with User
  @scala.inline
  def id: id = "id".asInstanceOf[id]
  
  @js.native
  sealed trait image extends PostFormat
  @scala.inline
  def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait inherit extends StObject
  @scala.inline
  def inherit: inherit = "inherit".asInstanceOf[inherit]
  
  @js.native
  sealed trait link
    extends Block
       with Category
       with Comment
       with Media
       with Page
       with Post
       with PostFormat
       with Tag
       with User
  @scala.inline
  def link: link = "link".asInstanceOf[link]
  
  @js.native
  sealed trait link_category extends TaxonomyKind
  @scala.inline
  def link_category: link_category = "link_category".asInstanceOf[link_category]
  
  @js.native
  sealed trait media_details extends Media
  @scala.inline
  def media_details: media_details = "media_details".asInstanceOf[media_details]
  
  @js.native
  sealed trait media_type extends Media
  @scala.inline
  def media_type: media_type = "media_type".asInstanceOf[media_type]
  
  @js.native
  sealed trait menu_order
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
  @scala.inline
  def menu_order: menu_order = "menu_order".asInstanceOf[menu_order]
  
  @js.native
  sealed trait meta
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Category
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Comment
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.User
  @scala.inline
  def meta: meta = "meta".asInstanceOf[meta]
  
  @js.native
  sealed trait mime_type extends Media
  @scala.inline
  def mime_type: mime_type = "mime_type".asInstanceOf[mime_type]
  
  @js.native
  sealed trait modified
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Block
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.PostRevision
  @scala.inline
  def modified: modified = "modified".asInstanceOf[modified]
  
  @js.native
  sealed trait modified_gmt
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Block
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.PostRevision
  @scala.inline
  def modified_gmt: modified_gmt = "modified_gmt".asInstanceOf[modified_gmt]
  
  @js.native
  sealed trait name
    extends Category
       with Status
       with Tag
       with Taxonomy
       with Type
       with User
  @scala.inline
  def name: name = "name".asInstanceOf[name]
  
  @js.native
  sealed trait nav_menu extends TaxonomyKind
  @scala.inline
  def nav_menu: nav_menu = "nav_menu".asInstanceOf[nav_menu]
  
  @js.native
  sealed trait open extends OpenOrClosed
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait parent
    extends Comment
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Category
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with PostRevision
  @scala.inline
  def parent: parent = "parent".asInstanceOf[parent]
  
  @js.native
  sealed trait pending extends PostStatus
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait ping_status
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
  @scala.inline
  def ping_status: ping_status = "ping_status".asInstanceOf[ping_status]
  
  @js.native
  sealed trait post
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Comment
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
  @scala.inline
  def post: post = "post".asInstanceOf[post]
  
  @js.native
  sealed trait post_format extends TaxonomyKind
  @scala.inline
  def post_format: post_format = "post_format".asInstanceOf[post_format]
  
  @js.native
  sealed trait post_tag extends TaxonomyKind
  @scala.inline
  def post_tag: post_tag = "post_tag".asInstanceOf[post_tag]
  
  @js.native
  sealed trait `private` extends PostStatus
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait public
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Status
  @scala.inline
  def public: public = "public".asInstanceOf[public]
  
  @js.native
  sealed trait publish extends PostStatus
  @scala.inline
  def publish: publish = "publish".asInstanceOf[publish]
  
  @js.native
  sealed trait queryable
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Status
  @scala.inline
  def queryable: queryable = "queryable".asInstanceOf[queryable]
  
  @js.native
  sealed trait quote extends PostFormat
  @scala.inline
  def quote: quote = "quote".asInstanceOf[quote]
  
  @js.native
  sealed trait rest_base
    extends Taxonomy
       with Type
  @scala.inline
  def rest_base: rest_base = "rest_base".asInstanceOf[rest_base]
  
  @js.native
  sealed trait slug
    extends Block
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
  @scala.inline
  def slug: slug = "slug".asInstanceOf[slug]
  
  @js.native
  sealed trait source_url extends Media
  @scala.inline
  def source_url: source_url = "source_url".asInstanceOf[source_url]
  
  @js.native
  sealed trait spam extends StObject
  @scala.inline
  def spam: spam = "spam".asInstanceOf[spam]
  
  @js.native
  sealed trait standard extends PostFormat
  @scala.inline
  def standard: standard = "standard".asInstanceOf[standard]
  
  @js.native
  sealed trait status
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Block
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Comment
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
       with PostFormat
  @scala.inline
  def status: status = "status".asInstanceOf[status]
  
  @js.native
  sealed trait sticky
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
  @scala.inline
  def sticky: sticky = "sticky".asInstanceOf[sticky]
  
  @js.native
  sealed trait tags
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
  @scala.inline
  def tags: tags = "tags".asInstanceOf[tags]
  
  @js.native
  sealed trait taxonomies
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Type
  @scala.inline
  def taxonomies: taxonomies = "taxonomies".asInstanceOf[taxonomies]
  
  @js.native
  sealed trait taxonomy
    extends Category
       with Tag
  @scala.inline
  def taxonomy: taxonomy = "taxonomy".asInstanceOf[taxonomy]
  
  @js.native
  sealed trait template
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Block
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
  @scala.inline
  def template: template = "template".asInstanceOf[template]
  
  @js.native
  sealed trait title
    extends Block
       with Media
       with Page
       with Post
       with PostRevision
  @scala.inline
  def title: title = "title".asInstanceOf[title]
  
  @js.native
  sealed trait trash extends StObject
  @scala.inline
  def trash: trash = "trash".asInstanceOf[trash]
  
  @js.native
  sealed trait `type`
    extends Block
       with Comment
       with Media
       with Page
       with Post
  @scala.inline
  def `type`: `type` = "type".asInstanceOf[`type`]
  
  @js.native
  sealed trait types
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Taxonomy
  @scala.inline
  def types: types = "types".asInstanceOf[types]
  
  @js.native
  sealed trait url extends User
  @scala.inline
  def url: url = "url".asInstanceOf[url]
  
  @js.native
  sealed trait video extends PostFormat
  @scala.inline
  def video: video = "video".asInstanceOf[video]
  
  @js.native
  sealed trait view extends Context
  @scala.inline
  def view: view = "view".asInstanceOf[view]
}
