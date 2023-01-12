package typings.vsoNodeApi.interfacesTfvcInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TfvcChange
  extends StObject
     with Change[TfvcItem] {
  
  /**
    * List of merge sources in case of rename or branch creation.
    */
  var mergeSources: js.Array[TfvcMergeSource]
  
  /**
    * Version at which a (shelved) change was pended against
    */
  var pendingVersion: Double
}
object TfvcChange {
  
  inline def apply(
    changeType: VersionControlChangeType,
    item: TfvcItem,
    mergeSources: js.Array[TfvcMergeSource],
    newContent: ItemContent,
    pendingVersion: Double,
    sourceServerItem: String,
    url: String
  ): TfvcChange = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], mergeSources = mergeSources.asInstanceOf[js.Any], newContent = newContent.asInstanceOf[js.Any], pendingVersion = pendingVersion.asInstanceOf[js.Any], sourceServerItem = sourceServerItem.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TfvcChange] (val x: Self) extends AnyVal {
    
    inline def setMergeSources(value: js.Array[TfvcMergeSource]): Self = StObject.set(x, "mergeSources", value.asInstanceOf[js.Any])
    
    inline def setMergeSourcesVarargs(value: TfvcMergeSource*): Self = StObject.set(x, "mergeSources", js.Array(value*))
    
    inline def setPendingVersion(value: Double): Self = StObject.set(x, "pendingVersion", value.asInstanceOf[js.Any])
  }
}
