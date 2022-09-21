package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestItem extends StObject {
  
  /**
    * Controls whether the item is shown as "busy" in the Test Explorer view.
    * This is useful for showing status while discovering children.
    *
    * Defaults to `false`.
    */
  var busy: Boolean
  
  /**
    * Indicates whether this test item may have children discovered by resolving.
    *
    * If true, this item is shown as expandable in the Test Explorer view and
    * expanding the item will cause {@link TestController.resolveHandler}
    * to be invoked with the item.
    *
    * Default to `false`.
    */
  var canResolveChildren: Boolean
  
  /**
    * The children of this test item. For a test suite, this may contain the
    * individual test cases or nested suites.
    */
  val children: TestItemCollection
  
  /**
    * Optional description that appears next to the label.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Optional error encountered while loading the test.
    *
    * Note that this is not a test result and should only be used to represent errors in
    * test discovery, such as syntax errors.
    */
  var error: js.UndefOr[String | MarkdownString] = js.undefined
  
  /**
    * Identifier for the `TestItem`. This is used to correlate
    * test results and tests in the document with those in the workspace
    * (test explorer). This cannot change for the lifetime of the `TestItem`,
    * and must be unique among its parent's direct children.
    */
  val id: String
  
  /**
    * Display name describing the test case.
    */
  var label: String
  
  /**
    * The parent of this item. It's set automatically, and is undefined
    * top-level items in the {@link TestController.items} and for items that
    * aren't yet included in another item's {@link TestItem.children children}.
    */
  val parent: js.UndefOr[TestItem] = js.undefined
  
  /**
    * Location of the test item in its {@link TestItem.uri uri}.
    *
    * This is only meaningful if the `uri` points to a file.
    */
  var range: js.UndefOr[Range] = js.undefined
  
  /**
    * A string that should be used when comparing this item
    * with other items. When `falsy` the {@link TestItem.label label}
    * is used.
    */
  var sortText: js.UndefOr[String] = js.undefined
  
  /**
    * Tags associated with this test item. May be used in combination with
    * {@link TestRunProfile.tags}, or simply as an organizational feature.
    */
  var tags: js.Array[TestTag]
  
  /**
    * URI this `TestItem` is associated with. May be a file or directory.
    */
  val uri: js.UndefOr[Uri] = js.undefined
}
object TestItem {
  
  inline def apply(
    busy: Boolean,
    canResolveChildren: Boolean,
    children: TestItemCollection,
    id: String,
    label: String,
    tags: js.Array[TestTag]
  ): TestItem = {
    val __obj = js.Dynamic.literal(busy = busy.asInstanceOf[js.Any], canResolveChildren = canResolveChildren.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestItem]
  }
  
  extension [Self <: TestItem](x: Self) {
    
    inline def setBusy(value: Boolean): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
    
    inline def setCanResolveChildren(value: Boolean): Self = StObject.set(x, "canResolveChildren", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: TestItemCollection): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setError(value: String | MarkdownString): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setParent(value: TestItem): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setSortText(value: String): Self = StObject.set(x, "sortText", value.asInstanceOf[js.Any])
    
    inline def setSortTextUndefined: Self = StObject.set(x, "sortText", js.undefined)
    
    inline def setTags(value: js.Array[TestTag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: TestTag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
