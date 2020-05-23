package typings.winrtUwp.Windows.Graphics.Holographic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HolographicSpace extends js.Object {
   /* unmapped type */ var addEventListener: js.Any
   /* unmapped type */ var createNextFrame: js.Any
   /* unmapped type */ var oncameraadded: js.Any
   /* unmapped type */ var oncameraremoved: js.Any
   /* unmapped type */ var primaryAdapterId: js.Any
   /* unmapped type */ var removeEventListener: js.Any
   /* unmapped type */ var setDirect3D11Device: js.Any
}

object HolographicSpace {
  @scala.inline
  def apply(
    addEventListener: js.Any,
    createNextFrame: js.Any,
    oncameraadded: js.Any,
    oncameraremoved: js.Any,
    primaryAdapterId: js.Any,
    removeEventListener: js.Any,
    setDirect3D11Device: js.Any
  ): HolographicSpace = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener.asInstanceOf[js.Any], createNextFrame = createNextFrame.asInstanceOf[js.Any], oncameraadded = oncameraadded.asInstanceOf[js.Any], oncameraremoved = oncameraremoved.asInstanceOf[js.Any], primaryAdapterId = primaryAdapterId.asInstanceOf[js.Any], removeEventListener = removeEventListener.asInstanceOf[js.Any], setDirect3D11Device = setDirect3D11Device.asInstanceOf[js.Any])
    __obj.asInstanceOf[HolographicSpace]
  }
}

