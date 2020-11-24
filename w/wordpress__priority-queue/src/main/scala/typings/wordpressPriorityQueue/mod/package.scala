package typings.wordpressPriorityQueue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type WPPriorityQueueAdd = js.Function2[/* element */ js.Object, /* item */ js.Function0[scala.Unit], scala.Unit]
  
  type WPPriorityQueueCallback = js.Function0[scala.Unit]
  
  type WPPriorityQueueContext = js.Object
  
  type WPPriorityQueueFlush = js.Function1[/* element */ js.Object, scala.Boolean]
  
  type WPPriorityQueueReset = js.Function0[scala.Unit]
}
