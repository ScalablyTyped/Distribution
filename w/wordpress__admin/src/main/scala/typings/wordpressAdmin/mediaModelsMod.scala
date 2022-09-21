package typings.wordpressAdmin

import org.scalablytyped.runtime.StringDictionary
import typings.backbone.mod.Collection
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.backbone.mod.Silenceable
import typings.lodash.mod.MemoizedFunction
import typings.std.Record
import typings.wordpressAdmin.anon.Add
import typings.wordpressAdmin.anon.Filters
import typings.wordpressAdmin.anon.Get
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaModelsMod {
  
  @js.native
  trait Attachment extends Model[Any, ModelSetOptions, Any] {
    
    /**
      * Create a new model on the static 'all' attachments collection and return it.
      */
    def create(attrs: Record[String, Any]): Attachment = js.native
    
    def get(id: String): Any & MemoizedFunction = js.native
    def get(id: String, attachment: Model[Any, ModelSetOptions, Any]): Any & MemoizedFunction = js.native
    
    @JSName("id")
    var id_Attachment: Double = js.native
    
    // Returns wp.media.ajax;
    /**
      * Convert date strings into Date objects.
      *
      * @param  resp The raw response object, typically returned by fetch()
      * @return      The modified response object, which is the attributes hash
      *              to be set on the model.
      */
    def parse(response: Record[String, Any]): Record[String, Any] = js.native
    
    def saveCompat(data: AttachmentOptionsData, options: Record[String, Any]): js.Promise[Any] = js.native
    
    /**
      * Triggered when attachment details change
      * Overrides Backbone.Model.sync
      */
    def sync(method: String, model: Attachment, options: Any): Any = js.native
  }
  
  trait AttachmentFilters extends StObject {
    
    def search(attachment: Attachment): Boolean
    
    def status(attachment: Attachment): Boolean
    
    def `type`(attachment: Attachment): Boolean
    
    def uploadedTo(attachment: Attachment): Boolean
  }
  object AttachmentFilters {
    
    inline def apply(
      search: Attachment => Boolean,
      status: Attachment => Boolean,
      `type`: Attachment => Boolean,
      uploadedTo: Attachment => Boolean
    ): AttachmentFilters = {
      val __obj = js.Dynamic.literal(search = js.Any.fromFunction1(search), status = js.Any.fromFunction1(status), uploadedTo = js.Any.fromFunction1(uploadedTo))
      __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
      __obj.asInstanceOf[AttachmentFilters]
    }
    
    extension [Self <: AttachmentFilters](x: Self) {
      
      inline def setSearch(value: Attachment => Boolean): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
      
      inline def setStatus(value: Attachment => Boolean): Self = StObject.set(x, "status", js.Any.fromFunction1(value))
      
      inline def setType(value: Attachment => Boolean): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
      
      inline def setUploadedTo(value: Attachment => Boolean): Self = StObject.set(x, "uploadedTo", js.Any.fromFunction1(value))
    }
  }
  
  trait AttachmentOptions extends StObject {
    
    var context: Record[String, Any]
    
    var data: AttachmentOptionsData
  }
  object AttachmentOptions {
    
    inline def apply(context: Record[String, Any], data: AttachmentOptionsData): AttachmentOptions = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttachmentOptions]
    }
    
    extension [Self <: AttachmentOptions](x: Self) {
      
      inline def setContext(value: Record[String, Any]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setData(value: AttachmentOptionsData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait AttachmentOptionsData extends StObject {
    
    var action: js.UndefOr[String] = js.undefined
    
    var changes: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var id: js.UndefOr[Double] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var post_id: js.UndefOr[Double] = js.undefined
  }
  object AttachmentOptionsData {
    
    inline def apply(): AttachmentOptionsData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttachmentOptionsData]
    }
    
    extension [Self <: AttachmentOptionsData](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setChanges(value: StringDictionary[String]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      inline def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setPost_id(value: Double): Self = StObject.set(x, "post_id", value.asInstanceOf[js.Any])
      
      inline def setPost_idUndefined: Self = StObject.set(x, "post_id", js.undefined)
    }
  }
  
  @js.native
  trait Attachments extends Collection[Attachment] {
    
    // returns wp.media.post;
    /**
      * A function to compare two attachment models in an attachments collection.
      *
      * Used as the default comparator for instances of wp.media.model.Attachments
      * and its subclasses.
      */
    @JSName("comparator")
    def comparator_MAttachments(
      a: Model[Any, ModelSetOptions, Any],
      b: Model[Any, ModelSetOptions, Any],
      options: Record[String, Any]
    ): Double = js.native
    
    var filters: AttachmentFilters = js.native
    
    /**
      * Gets the total number of attachments.
      */
    def getTotalAttachments(): Double = js.native
    
    /**
      * Whether there are more attachments that haven't been sync'd from the server
      * that match the collection's query.
      *
      * Only works if the collection is mirroring a Query Attachments collection,
      * and forwards to its `hasMore` method. This collection class doesn't have
      * server persistence by itself.
      */
    def hasMore(): Boolean = js.native
    
    def initialize(models: js.Array[Attachment], options: AttachmentsOptions): Unit = js.native
    
    /**
      * Start mirroring another attachments collection, clearing out any models already
      * in the collection.
      */
    def mirror(attachments: js.Array[Attachment]): Attachments = js.native
    
    @JSName("model")
    var model_Attachments: Attachment = js.native
    
    /**
      * Retrieve more attachments from the server for the collection.
      *
      * Only works if the collection is mirroring a Query Attachments collection,
      * and forwards to its `more` method. This collection class doesn't have
      * server persistence by itself.
      */
    def more(options: Any): js.Promise[Any] = js.native
    
    /**
      * Start observing another attachments collection change events
      * and replicate them on this collection.
      */
    def observe(attachments: js.Array[Attachment]): Attachments = js.native
    
    /**
      * A custom Ajax-response parser.
      *
      * See trac ticket #24753.
      *
      * Called automatically by Backbone whenever a collection's models are returned
      * by the server, in fetch. The default implementation is a no-op, simply
      * passing through the JSON response. We override this to add attributes to
      * the collection items.
      */
    def parse(response: Record[String, Any], xhr: Any): Record[String, Any] = js.native
    
    /**
      * If this collection is sorted by `menuOrder`, recalculates and saves
      * the menu order to the database.
      */
    def saveMenuOrder(): Any = js.native
    
    /**
      * Stop mirroring another attachments collection.
      */
    def unmirror(): Unit = js.native
    
    /**
      * Stop replicating collection change events from another attachments collection.
      */
    def unobserve(attachments: js.Array[Attachment]): Attachments = js.native
    
    /**
      * Add or remove an attachment to the collection depending on its validity.
      */
    def validate(attachment: Attachment, options: Silenceable): Attachments = js.native
    
    /**
      * Add or remove all attachments from another collection depending on each one's validity.
      */
    def validateAll(attachments: js.Array[Attachment], options: Silenceable): Attachments = js.native
    
    var validateDestroyed: Boolean = js.native
    
    /**
      * Checks whether an attachment is valid.
      */
    def validator(attachment: Attachment): Boolean = js.native
  }
  
  trait AttachmentsOptions extends StObject {
    
    var props: Filters
  }
  object AttachmentsOptions {
    
    inline def apply(props: Filters): AttachmentsOptions = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttachmentsOptions]
    }
    
    extension [Self <: AttachmentsOptions](x: Self) {
      
      inline def setProps(value: Filters): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PostImage extends Model[Any, ModelSetOptions, Any] {
    
    def bindAttachmentListeners(): Unit = js.native
    
    def changeAttachment(attachment: Attachment, props: Any): Unit = js.native
    
    def initialize(attributes: PostImageAttributes): Unit = js.native
    
    def setAspectRatio(): Unit = js.native
    
    def setLinkTypeFromUrl(): Unit = js.native
    
    def updateLinkUrl(): Unit = js.native
    
    def updateSize(): Unit = js.native
  }
  
  trait PostImageAttributes
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var attachment_id: Double
  }
  object PostImageAttributes {
    
    inline def apply(attachment_id: Double): PostImageAttributes = {
      val __obj = js.Dynamic.literal(attachment_id = attachment_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostImageAttributes]
    }
    
    extension [Self <: PostImageAttributes](x: Self) {
      
      inline def setAttachment_id(value: Double): Self = StObject.set(x, "attachment_id", value.asInstanceOf[js.Any])
    }
  }
  
  type Query = Attachments & Get
  
  type Selection = Attachments & Add
}
