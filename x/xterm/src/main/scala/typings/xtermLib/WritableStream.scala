package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WritableStream[W] extends js.Object {
  val locked: scala.Boolean = js.native
  def abort(): js.Promise[scala.Unit] = js.native
  def abort(reason: js.Any): js.Promise[scala.Unit] = js.native
  def getWriter(): WritableStreamDefaultWriter[W] = js.native
}

@JSGlobal("WritableStream")
@js.native
object WritableStream
  extends ScalablyTyped.runtime.Instantiable0[WritableStream[js.Object]]
     with ScalablyTyped.runtime.Instantiable1[/* underlyingSink */ UnderlyingSink[js.Object], WritableStream[js.Object]]
     with ScalablyTyped.runtime.Instantiable2[
      /* underlyingSink */ UnderlyingSink[js.Object], 
      /* strategy */ QueuingStrategy[js.Object], 
      WritableStream[js.Object]
    ]

