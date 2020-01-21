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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object wordpressApiFetchStrings {
  @js.native
  sealed trait Decontextualize extends js.Object
  
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
  
  @js.native
  sealed trait alt_text extends Media
  
  @js.native
  sealed trait approved extends js.Object
  
  @js.native
  sealed trait aside extends PostFormat
  
  @js.native
  sealed trait audio extends PostFormat
  
  @js.native
  sealed trait author
    extends Comment
       with Media
       with Page
       with Post
       with PostRevision
  
  @js.native
  sealed trait author_avatar_urls extends Comment
  
  @js.native
  sealed trait author_name extends Comment
  
  @js.native
  sealed trait author_url extends Comment
  
  @js.native
  sealed trait avatar_urls extends User
  
  @js.native
  sealed trait caption extends Media
  
  @js.native
  sealed trait categories
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
  
  @js.native
  sealed trait category extends TaxonomyKind
  
  @js.native
  sealed trait chat extends PostFormat
  
  @js.native
  sealed trait closed extends OpenOrClosed
  
  @js.native
  sealed trait comment_status
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
  
  @js.native
  sealed trait content
    extends Comment
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Block
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.PostRevision
  
  @js.native
  sealed trait count
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Category
  
  @js.native
  sealed trait date
    extends Block
       with Comment
       with Media
       with Page
       with Post
       with PostRevision
  
  @js.native
  sealed trait date_gmt
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Block
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Comment
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.PostRevision
  
  @js.native
  sealed trait description
    extends User
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Category
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Taxonomy
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Type
  
  @js.native
  sealed trait draft extends PostStatus
  
  @js.native
  sealed trait edit extends Context
  
  @js.native
  sealed trait embed extends Context
  
  @js.native
  sealed trait excerpt
    extends Page
       with Post
       with PostRevision
  
  @js.native
  sealed trait featured_media
    extends Page
       with Post
  
  @js.native
  sealed trait file extends js.Object
  
  @js.native
  sealed trait format
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
  
  @js.native
  sealed trait future extends PostStatus
  
  @js.native
  sealed trait gallery extends PostFormat
  
  @js.native
  sealed trait guid
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Block
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.PostRevision
  
  @js.native
  sealed trait hierarchical
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Taxonomy
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Type
  
  @js.native
  sealed trait hold extends js.Object
  
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
  
  @js.native
  sealed trait image extends PostFormat
  
  @js.native
  sealed trait inherit extends js.Object
  
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
  
  @js.native
  sealed trait link_category extends TaxonomyKind
  
  @js.native
  sealed trait media_details extends Media
  
  @js.native
  sealed trait media_type extends Media
  
  @js.native
  sealed trait menu_order
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
  
  @js.native
  sealed trait meta
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Category
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Comment
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.User
  
  @js.native
  sealed trait mime_type extends Media
  
  @js.native
  sealed trait modified
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Block
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.PostRevision
  
  @js.native
  sealed trait modified_gmt
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Block
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.PostRevision
  
  @js.native
  sealed trait name
    extends Category
       with Status
       with Tag
       with Taxonomy
       with Type
       with User
  
  @js.native
  sealed trait nav_menu extends TaxonomyKind
  
  @js.native
  sealed trait open extends OpenOrClosed
  
  @js.native
  sealed trait parent
    extends Comment
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Category
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with PostRevision
  
  @js.native
  sealed trait pending extends PostStatus
  
  @js.native
  sealed trait ping_status
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
  
  @js.native
  sealed trait post
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Comment
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
  
  @js.native
  sealed trait post_format extends TaxonomyKind
  
  @js.native
  sealed trait post_tag extends TaxonomyKind
  
  @js.native
  sealed trait `private` extends PostStatus
  
  @js.native
  sealed trait public
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Status
  
  @js.native
  sealed trait publish extends PostStatus
  
  @js.native
  sealed trait queryable
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Status
  
  @js.native
  sealed trait quote extends PostFormat
  
  @js.native
  sealed trait rest_base
    extends Taxonomy
       with Type
  
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
  
  @js.native
  sealed trait source_url extends Media
  
  @js.native
  sealed trait spam extends js.Object
  
  @js.native
  sealed trait standard extends PostFormat
  
  @js.native
  sealed trait status
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Block
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Comment
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
       with PostFormat
  
  @js.native
  sealed trait sticky
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
  
  @js.native
  sealed trait tags
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
  
  @js.native
  sealed trait taxonomies
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Type
  
  @js.native
  sealed trait taxonomy
    extends Category
       with Tag
  
  @js.native
  sealed trait template
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Block
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Media
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
       with typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
  
  @js.native
  sealed trait title
    extends Block
       with Media
       with Page
       with Post
       with PostRevision
  
  @js.native
  sealed trait trash extends js.Object
  
  @js.native
  sealed trait `type`
    extends Block
       with Comment
       with Media
       with Page
       with Post
  
  @js.native
  sealed trait types
    extends typings.wordpressApiFetch.mod.Schema.ViewKeys.Taxonomy
  
  @js.native
  sealed trait url extends User
  
  @js.native
  sealed trait video extends PostFormat
  
  @js.native
  sealed trait view extends Context
  
  @scala.inline
  def Decontextualize: Decontextualize = "Decontextualize".asInstanceOf[Decontextualize]
  @scala.inline
  def _embedded: _embedded = "_embedded".asInstanceOf[_embedded]
  @scala.inline
  def _links: _links = "_links".asInstanceOf[_links]
  @scala.inline
  def alt_text: alt_text = "alt_text".asInstanceOf[alt_text]
  @scala.inline
  def approved: approved = "approved".asInstanceOf[approved]
  @scala.inline
  def aside: aside = "aside".asInstanceOf[aside]
  @scala.inline
  def audio: audio = "audio".asInstanceOf[audio]
  @scala.inline
  def author: author = "author".asInstanceOf[author]
  @scala.inline
  def author_avatar_urls: author_avatar_urls = "author_avatar_urls".asInstanceOf[author_avatar_urls]
  @scala.inline
  def author_name: author_name = "author_name".asInstanceOf[author_name]
  @scala.inline
  def author_url: author_url = "author_url".asInstanceOf[author_url]
  @scala.inline
  def avatar_urls: avatar_urls = "avatar_urls".asInstanceOf[avatar_urls]
  @scala.inline
  def caption: caption = "caption".asInstanceOf[caption]
  @scala.inline
  def categories: categories = "categories".asInstanceOf[categories]
  @scala.inline
  def category: category = "category".asInstanceOf[category]
  @scala.inline
  def chat: chat = "chat".asInstanceOf[chat]
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  @scala.inline
  def comment_status: comment_status = "comment_status".asInstanceOf[comment_status]
  @scala.inline
  def content: content = "content".asInstanceOf[content]
  @scala.inline
  def count: count = "count".asInstanceOf[count]
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  @scala.inline
  def date_gmt: date_gmt = "date_gmt".asInstanceOf[date_gmt]
  @scala.inline
  def description: description = "description".asInstanceOf[description]
  @scala.inline
  def draft: draft = "draft".asInstanceOf[draft]
  @scala.inline
  def edit: edit = "edit".asInstanceOf[edit]
  @scala.inline
  def embed: embed = "embed".asInstanceOf[embed]
  @scala.inline
  def excerpt: excerpt = "excerpt".asInstanceOf[excerpt]
  @scala.inline
  def featured_media: featured_media = "featured_media".asInstanceOf[featured_media]
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  @scala.inline
  def format: format = "format".asInstanceOf[format]
  @scala.inline
  def future: future = "future".asInstanceOf[future]
  @scala.inline
  def gallery: gallery = "gallery".asInstanceOf[gallery]
  @scala.inline
  def guid: guid = "guid".asInstanceOf[guid]
  @scala.inline
  def hierarchical: hierarchical = "hierarchical".asInstanceOf[hierarchical]
  @scala.inline
  def hold: hold = "hold".asInstanceOf[hold]
  @scala.inline
  def id: id = "id".asInstanceOf[id]
  @scala.inline
  def image: image = "image".asInstanceOf[image]
  @scala.inline
  def inherit: inherit = "inherit".asInstanceOf[inherit]
  @scala.inline
  def link: link = "link".asInstanceOf[link]
  @scala.inline
  def link_category: link_category = "link_category".asInstanceOf[link_category]
  @scala.inline
  def media_details: media_details = "media_details".asInstanceOf[media_details]
  @scala.inline
  def media_type: media_type = "media_type".asInstanceOf[media_type]
  @scala.inline
  def menu_order: menu_order = "menu_order".asInstanceOf[menu_order]
  @scala.inline
  def meta: meta = "meta".asInstanceOf[meta]
  @scala.inline
  def mime_type: mime_type = "mime_type".asInstanceOf[mime_type]
  @scala.inline
  def modified: modified = "modified".asInstanceOf[modified]
  @scala.inline
  def modified_gmt: modified_gmt = "modified_gmt".asInstanceOf[modified_gmt]
  @scala.inline
  def name: name = "name".asInstanceOf[name]
  @scala.inline
  def nav_menu: nav_menu = "nav_menu".asInstanceOf[nav_menu]
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  @scala.inline
  def parent: parent = "parent".asInstanceOf[parent]
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  @scala.inline
  def ping_status: ping_status = "ping_status".asInstanceOf[ping_status]
  @scala.inline
  def post: post = "post".asInstanceOf[post]
  @scala.inline
  def post_format: post_format = "post_format".asInstanceOf[post_format]
  @scala.inline
  def post_tag: post_tag = "post_tag".asInstanceOf[post_tag]
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  @scala.inline
  def public: public = "public".asInstanceOf[public]
  @scala.inline
  def publish: publish = "publish".asInstanceOf[publish]
  @scala.inline
  def queryable: queryable = "queryable".asInstanceOf[queryable]
  @scala.inline
  def quote: quote = "quote".asInstanceOf[quote]
  @scala.inline
  def rest_base: rest_base = "rest_base".asInstanceOf[rest_base]
  @scala.inline
  def slug: slug = "slug".asInstanceOf[slug]
  @scala.inline
  def source_url: source_url = "source_url".asInstanceOf[source_url]
  @scala.inline
  def spam: spam = "spam".asInstanceOf[spam]
  @scala.inline
  def standard: standard = "standard".asInstanceOf[standard]
  @scala.inline
  def status: status = "status".asInstanceOf[status]
  @scala.inline
  def sticky: sticky = "sticky".asInstanceOf[sticky]
  @scala.inline
  def tags: tags = "tags".asInstanceOf[tags]
  @scala.inline
  def taxonomies: taxonomies = "taxonomies".asInstanceOf[taxonomies]
  @scala.inline
  def taxonomy: taxonomy = "taxonomy".asInstanceOf[taxonomy]
  @scala.inline
  def template: template = "template".asInstanceOf[template]
  @scala.inline
  def title: title = "title".asInstanceOf[title]
  @scala.inline
  def trash: trash = "trash".asInstanceOf[trash]
  @scala.inline
  def `type`: `type` = "type".asInstanceOf[`type`]
  @scala.inline
  def types: types = "types".asInstanceOf[types]
  @scala.inline
  def url: url = "url".asInstanceOf[url]
  @scala.inline
  def video: video = "video".asInstanceOf[video]
  @scala.inline
  def view: view = "view".asInstanceOf[view]
}

