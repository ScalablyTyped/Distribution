package typings.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveQueryImpl
  extends StObject
     with SyncEntity {
  
  /* private */ val cache: Any = js.native
  
  /* private */ val descriptor: Any = js.native
  
  def getItems(): ItemsSnapshot = js.native
  
  /* private */ var handleBatchUpdate: Any = js.native
  
  /* private */ var handleItemMutated: Any = js.native
  
  /* private */ var handleItemRemoved: Any = js.native
  
  def liveQueryDescriptor: LiveQueryDescriptor = js.native
  
  // dummy stub from iface
  /* protected */ def onRemoved(): Unit = js.native
  
  // custom private props
  def queryUri: String = js.native
  
  /* private */ var shouldIgnoreEvent: Any = js.native
}
