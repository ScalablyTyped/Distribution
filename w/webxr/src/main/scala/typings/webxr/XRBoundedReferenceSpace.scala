package typings.webxr

import typings.std.DOMPointReadOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Extends XRReferenceSpace to include boundsGeometry, indicating the pre-configured boundaries
  * of the user's space.
  *
  * ref: https://immersive-web.github.io/webxr/#xrboundedreferencespace-interface
  */
@js.native
trait XRBoundedReferenceSpace
  extends StObject
     with XRReferenceSpace {
  
  val boundsGeometry: js.Array[DOMPointReadOnly] = js.native
}
