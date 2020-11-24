package typings.twilioSync.treeMod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeMapInterface[K, V]
  extends Map[K, V]
     with Iterable[js.Tuple2[K, V]]
