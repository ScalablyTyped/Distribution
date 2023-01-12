package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentChangeCallback extends StObject {
  
  /**
    * Called when content is added.
    *
    * @param content The content to add.
    */
  def oncontentadded(content: Content_): Unit
  
  /**
    * Called when a content directory is added.
    *
    * @since 2.4
    *
    * @param contentDir The added content directory.
    */
  def oncontentdiradded(contentDir: ContentDirectory): Unit
  
  /**
    * Called when a content directory is removed.
    *
    * @since 2.4
    *
    * @param id The ID of removed content directory.
    */
  def oncontentdirremoved(id: ContentDirectoryId): Unit
  
  /**
    * Called when a content directory is updated.
    *
    * @since 2.4
    *
    * @param contentDir The content directory after the update operation.
    */
  def oncontentdirupdated(contentDir: ContentDirectory): Unit
  
  /**
    * Called when content is removed.
    *
    * @param id The ID of removed content.
    */
  def oncontentremoved(id: ContentId): Unit
  
  /**
    * Called when content is updated.
    *
    * @param content The content to update.
    */
  def oncontentupdated(content: Content_): Unit
}
object ContentChangeCallback {
  
  inline def apply(
    oncontentadded: Content_ => Unit,
    oncontentdiradded: ContentDirectory => Unit,
    oncontentdirremoved: ContentDirectoryId => Unit,
    oncontentdirupdated: ContentDirectory => Unit,
    oncontentremoved: ContentId => Unit,
    oncontentupdated: Content_ => Unit
  ): ContentChangeCallback = {
    val __obj = js.Dynamic.literal(oncontentadded = js.Any.fromFunction1(oncontentadded), oncontentdiradded = js.Any.fromFunction1(oncontentdiradded), oncontentdirremoved = js.Any.fromFunction1(oncontentdirremoved), oncontentdirupdated = js.Any.fromFunction1(oncontentdirupdated), oncontentremoved = js.Any.fromFunction1(oncontentremoved), oncontentupdated = js.Any.fromFunction1(oncontentupdated))
    __obj.asInstanceOf[ContentChangeCallback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentChangeCallback] (val x: Self) extends AnyVal {
    
    inline def setOncontentadded(value: Content_ => Unit): Self = StObject.set(x, "oncontentadded", js.Any.fromFunction1(value))
    
    inline def setOncontentdiradded(value: ContentDirectory => Unit): Self = StObject.set(x, "oncontentdiradded", js.Any.fromFunction1(value))
    
    inline def setOncontentdirremoved(value: ContentDirectoryId => Unit): Self = StObject.set(x, "oncontentdirremoved", js.Any.fromFunction1(value))
    
    inline def setOncontentdirupdated(value: ContentDirectory => Unit): Self = StObject.set(x, "oncontentdirupdated", js.Any.fromFunction1(value))
    
    inline def setOncontentremoved(value: ContentId => Unit): Self = StObject.set(x, "oncontentremoved", js.Any.fromFunction1(value))
    
    inline def setOncontentupdated(value: Content_ => Unit): Self = StObject.set(x, "oncontentupdated", js.Any.fromFunction1(value))
  }
}
