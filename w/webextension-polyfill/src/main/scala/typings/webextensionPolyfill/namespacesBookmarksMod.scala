package typings.webextensionPolyfill

import typings.webextensionPolyfill.namespacesEventsMod.Events.Event
import typings.webextensionPolyfill.webextensionPolyfillStrings.managed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesBookmarksMod {
  
  object Bookmarks {
    
    /**
      * A node (either a bookmark or a folder) in the bookmark tree.  Child nodes are ordered within their parent folder.
      */
    trait BookmarkTreeNode extends StObject {
      
      /**
        * An ordered list of children of this node.
        * Optional.
        */
      var children: js.UndefOr[js.Array[BookmarkTreeNode]] = js.undefined
      
      /**
        * When this node was created, in milliseconds since the epoch (<code>new Date(dateAdded)</code>).
        * Optional.
        */
      var dateAdded: js.UndefOr[Double] = js.undefined
      
      /**
        * When the contents of this folder last changed, in milliseconds since the epoch.
        * Optional.
        */
      var dateGroupModified: js.UndefOr[Double] = js.undefined
      
      /**
        * The unique identifier for the node. IDs are unique within the current profile, and they remain valid even after the
        * browser is restarted.
        */
      var id: String
      
      /**
        * The 0-based position of this node within its parent folder.
        * Optional.
        */
      var index: js.UndefOr[Double] = js.undefined
      
      /**
        * The <code>id</code> of the parent folder.  Omitted for the root node.
        * Optional.
        */
      var parentId: js.UndefOr[String] = js.undefined
      
      /**
        * The text displayed for the node.
        */
      var title: String
      
      /**
        * Indicates the type of the BookmarkTreeNode, which can be one of bookmark, folder or separator.
        * Optional.
        */
      var `type`: js.UndefOr[BookmarkTreeNodeType] = js.undefined
      
      /**
        * Indicates the reason why this node is unmodifiable. The <var>managed</var> value indicates that this node was configured
        * by the system administrator or by the custodian of a supervised user. Omitted if the node can be modified by the user
        * and the extension (default).
        * Optional.
        */
      var unmodifiable: js.UndefOr[BookmarkTreeNodeUnmodifiable] = js.undefined
      
      /**
        * The URL navigated to when a user clicks the bookmark. Omitted for folders.
        * Optional.
        */
      var url: js.UndefOr[String] = js.undefined
    }
    object BookmarkTreeNode {
      
      inline def apply(id: String, title: String): BookmarkTreeNode = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[BookmarkTreeNode]
      }
      
      extension [Self <: BookmarkTreeNode](x: Self) {
        
        inline def setChildren(value: js.Array[BookmarkTreeNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setChildrenVarargs(value: BookmarkTreeNode*): Self = StObject.set(x, "children", js.Array(value*))
        
        inline def setDateAdded(value: Double): Self = StObject.set(x, "dateAdded", value.asInstanceOf[js.Any])
        
        inline def setDateAddedUndefined: Self = StObject.set(x, "dateAdded", js.undefined)
        
        inline def setDateGroupModified(value: Double): Self = StObject.set(x, "dateGroupModified", value.asInstanceOf[js.Any])
        
        inline def setDateGroupModifiedUndefined: Self = StObject.set(x, "dateGroupModified", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
        
        inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
        
        inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setType(value: BookmarkTreeNodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setUnmodifiable(value: BookmarkTreeNodeUnmodifiable): Self = StObject.set(x, "unmodifiable", value.asInstanceOf[js.Any])
        
        inline def setUnmodifiableUndefined: Self = StObject.set(x, "unmodifiable", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    /**
      * Indicates the type of a BookmarkTreeNode, which can be one of bookmark, folder or separator.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.bookmark
      - typings.webextensionPolyfill.webextensionPolyfillStrings.folder
      - typings.webextensionPolyfill.webextensionPolyfillStrings.separator
    */
    trait BookmarkTreeNodeType extends StObject
    object BookmarkTreeNodeType {
      
      inline def bookmark: typings.webextensionPolyfill.webextensionPolyfillStrings.bookmark = "bookmark".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.bookmark]
      
      inline def folder: typings.webextensionPolyfill.webextensionPolyfillStrings.folder = "folder".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.folder]
      
      inline def separator: typings.webextensionPolyfill.webextensionPolyfillStrings.separator = "separator".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.separator]
    }
    
    /**
      * Indicates the reason why this node is unmodifiable. The <var>managed</var> value indicates that this node was configured
      * by the system administrator or by the custodian of a supervised user. Omitted if the node can be modified by the user
      * and the extension (default).
      */
    type BookmarkTreeNodeUnmodifiable = managed
    
    /**
      * Object passed to the create() function.
      */
    trait CreateDetails extends StObject {
      
      /**
        * Optional.
        */
      var index: js.UndefOr[Double] = js.undefined
      
      /**
        * Defaults to the Other Bookmarks folder.
        * Optional.
        */
      var parentId: js.UndefOr[String] = js.undefined
      
      /**
        * Optional.
        */
      var title: js.UndefOr[String] = js.undefined
      
      /**
        * Indicates the type of BookmarkTreeNode to create, which can be one of bookmark, folder or separator.
        * Optional.
        */
      var `type`: js.UndefOr[BookmarkTreeNodeType] = js.undefined
      
      /**
        * Optional.
        */
      var url: js.UndefOr[String] = js.undefined
    }
    object CreateDetails {
      
      inline def apply(): CreateDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateDetails]
      }
      
      extension [Self <: CreateDetails](x: Self) {
        
        inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
        
        inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
        
        inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setType(value: BookmarkTreeNodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    trait MoveDestinationType extends StObject {
      
      /**
        * Optional.
        */
      var index: js.UndefOr[Double] = js.undefined
      
      /**
        * Optional.
        */
      var parentId: js.UndefOr[String] = js.undefined
    }
    object MoveDestinationType {
      
      inline def apply(): MoveDestinationType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MoveDestinationType]
      }
      
      extension [Self <: MoveDestinationType](x: Self) {
        
        inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
        
        inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
        
        inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      }
    }
    
    trait OnChangedChangeInfoType extends StObject {
      
      var title: String
      
      /**
        * Optional.
        */
      var url: js.UndefOr[String] = js.undefined
    }
    object OnChangedChangeInfoType {
      
      inline def apply(title: String): OnChangedChangeInfoType = {
        val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[OnChangedChangeInfoType]
      }
      
      extension [Self <: OnChangedChangeInfoType](x: Self) {
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    trait OnMovedMoveInfoType extends StObject {
      
      var index: Double
      
      var oldIndex: Double
      
      var oldParentId: String
      
      var parentId: String
    }
    object OnMovedMoveInfoType {
      
      inline def apply(index: Double, oldIndex: Double, oldParentId: String, parentId: String): OnMovedMoveInfoType = {
        val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], oldParentId = oldParentId.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
        __obj.asInstanceOf[OnMovedMoveInfoType]
      }
      
      extension [Self <: OnMovedMoveInfoType](x: Self) {
        
        inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        inline def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
        
        inline def setOldParentId(value: String): Self = StObject.set(x, "oldParentId", value.asInstanceOf[js.Any])
        
        inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      }
    }
    
    trait OnRemovedRemoveInfoType extends StObject {
      
      var index: Double
      
      var node: BookmarkTreeNode
      
      var parentId: String
    }
    object OnRemovedRemoveInfoType {
      
      inline def apply(index: Double, node: BookmarkTreeNode, parentId: String): OnRemovedRemoveInfoType = {
        val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
        __obj.asInstanceOf[OnRemovedRemoveInfoType]
      }
      
      extension [Self <: OnRemovedRemoveInfoType](x: Self) {
        
        inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        inline def setNode(value: BookmarkTreeNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
        
        inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An object specifying properties and values to match when searching. Produces bookmarks matching all properties.
      */
    trait SearchQueryC2Type extends StObject {
      
      /**
        * A string of words that are matched against bookmark URLs and titles.
        * Optional.
        */
      var query: js.UndefOr[String] = js.undefined
      
      /**
        * The title of the bookmark; matches verbatim.
        * Optional.
        */
      var title: js.UndefOr[String] = js.undefined
      
      /**
        * The URL of the bookmark; matches verbatim. Note that folders have no URL.
        * Optional.
        */
      var url: js.UndefOr[String] = js.undefined
    }
    object SearchQueryC2Type {
      
      inline def apply(): SearchQueryC2Type = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SearchQueryC2Type]
      }
      
      extension [Self <: SearchQueryC2Type](x: Self) {
        
        inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
        
        inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    @js.native
    trait Static extends StObject {
      
      /**
        * Creates a bookmark or folder under the specified parentId.  If url is NULL or missing, it will be a folder.
        *
        * @param bookmark
        */
      def create(bookmark: CreateDetails): js.Promise[BookmarkTreeNode] = js.native
      
      /**
        * Retrieves the specified BookmarkTreeNode(s).
        *
        * @param idOrIdList A single string-valued id, or an array of string-valued ids
        */
      def get(idOrIdList: String): js.Promise[js.Array[BookmarkTreeNode]] = js.native
      def get(idOrIdList: js.Array[String]): js.Promise[js.Array[BookmarkTreeNode]] = js.native
      
      /**
        * Retrieves the children of the specified BookmarkTreeNode id.
        *
        * @param id
        */
      def getChildren(id: String): js.Promise[js.Array[BookmarkTreeNode]] = js.native
      
      /**
        * Retrieves the recently added bookmarks.
        *
        * @param numberOfItems The maximum number of items to return.
        */
      def getRecent(numberOfItems: Double): js.Promise[js.Array[BookmarkTreeNode]] = js.native
      
      /**
        * Retrieves part of the Bookmarks hierarchy, starting at the specified node.
        *
        * @param id The ID of the root of the subtree to retrieve.
        */
      def getSubTree(id: String): js.Promise[js.Array[BookmarkTreeNode]] = js.native
      
      /**
        * Retrieves the entire Bookmarks hierarchy.
        */
      def getTree(): js.Promise[js.Array[BookmarkTreeNode]] = js.native
      
      /**
        * Moves the specified BookmarkTreeNode to the provided location.
        *
        * @param id
        * @param destination
        */
      def move(id: String, destination: MoveDestinationType): js.Promise[BookmarkTreeNode] = js.native
      
      /**
        * Fired when a bookmark or folder changes.  <b>Note:</b> Currently, only title and url changes trigger this.
        *
        * @param id
        * @param changeInfo
        */
      var onChanged: Event[js.Function2[/* id */ String, /* changeInfo */ OnChangedChangeInfoType, Unit]] = js.native
      
      /**
        * Fired when a bookmark or folder is created.
        *
        * @param id
        * @param bookmark
        */
      var onCreated: Event[js.Function2[/* id */ String, /* bookmark */ BookmarkTreeNode, Unit]] = js.native
      
      /**
        * Fired when a bookmark or folder is moved to a different parent folder.
        *
        * @param id
        * @param moveInfo
        */
      var onMoved: Event[js.Function2[/* id */ String, /* moveInfo */ OnMovedMoveInfoType, Unit]] = js.native
      
      /**
        * Fired when a bookmark or folder is removed.  When a folder is removed recursively,
        * a single notification is fired for the folder, and none for its contents.
        *
        * @param id
        * @param removeInfo
        */
      var onRemoved: Event[js.Function2[/* id */ String, /* removeInfo */ OnRemovedRemoveInfoType, Unit]] = js.native
      
      /**
        * Removes a bookmark or an empty bookmark folder.
        *
        * @param id
        */
      def remove(id: String): js.Promise[Unit] = js.native
      
      /**
        * Recursively removes a bookmark folder.
        *
        * @param id
        */
      def removeTree(id: String): js.Promise[Unit] = js.native
      
      /**
        * Searches for BookmarkTreeNodes matching the given query. Queries specified with an object produce BookmarkTreeNodes
        * matching all specified properties.
        *
        * @param query Either a string of words that are matched against bookmark URLs and titles, or an object. If an object,
        * the properties <code>query</code>, <code>url</code>, and <code>title</code> may be specified and bookmarks matching all
        * specified properties will be produced.
        */
      def search(query: String): js.Promise[js.Array[BookmarkTreeNode]] = js.native
      def search(query: SearchQueryC2Type): js.Promise[js.Array[BookmarkTreeNode]] = js.native
      
      /**
        * Updates the properties of a bookmark or folder. Specify only the properties that you want to change; unspecified
        * properties will be left unchanged.  <b>Note:</b> Currently, only 'title' and 'url' are supported.
        *
        * @param id
        * @param changes
        */
      def update(id: String, changes: UpdateChangesType): js.Promise[BookmarkTreeNode] = js.native
    }
    
    trait UpdateChangesType extends StObject {
      
      /**
        * Optional.
        */
      var title: js.UndefOr[String] = js.undefined
      
      /**
        * Optional.
        */
      var url: js.UndefOr[String] = js.undefined
    }
    object UpdateChangesType {
      
      inline def apply(): UpdateChangesType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateChangesType]
      }
      
      extension [Self <: UpdateChangesType](x: Self) {
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
  }
}
