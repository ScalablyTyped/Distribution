package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "LoadingManager")
@js.native
class LoadingManager ()
  extends threeLib.threeDashCoreMod.LoadingManager {
  def this(onLoad: js.Function0[scala.Unit]) = this()
  def this(onLoad: js.Function0[scala.Unit], onProgress: js.Function3[
      /* url */ java.lang.String, 
      /* loaded */ scala.Double, 
      /* total */ scala.Double, 
      scala.Unit
    ]) = this()
  def this(onLoad: js.Function0[scala.Unit], onProgress: js.Function3[
      /* url */ java.lang.String, 
      /* loaded */ scala.Double, 
      /* total */ scala.Double, 
      scala.Unit
    ], onError: js.Function1[/* url */ java.lang.String, scala.Unit]) = this()
}

