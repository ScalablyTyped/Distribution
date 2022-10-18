package typings.three.srcThreeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three", "LoadingManager")
@js.native
open class LoadingManager ()
  extends typings.three.srcLoadersLoadingManagerMod.LoadingManager {
  def this(onLoad: js.Function0[Unit]) = this()
  def this(
    onLoad: js.Function0[Unit],
    onProgress: js.Function3[/* url */ String, /* loaded */ Double, /* total */ Double, Unit]
  ) = this()
  def this(
    onLoad: Unit,
    onProgress: js.Function3[/* url */ String, /* loaded */ Double, /* total */ Double, Unit]
  ) = this()
  def this(
    onLoad: js.Function0[Unit],
    onProgress: js.Function3[/* url */ String, /* loaded */ Double, /* total */ Double, Unit],
    onError: js.Function1[/* url */ String, Unit]
  ) = this()
  def this(onLoad: js.Function0[Unit], onProgress: Unit, onError: js.Function1[/* url */ String, Unit]) = this()
  def this(
    onLoad: Unit,
    onProgress: js.Function3[/* url */ String, /* loaded */ Double, /* total */ Double, Unit],
    onError: js.Function1[/* url */ String, Unit]
  ) = this()
  def this(onLoad: Unit, onProgress: Unit, onError: js.Function1[/* url */ String, Unit]) = this()
}
