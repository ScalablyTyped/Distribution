package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsDisabled extends StObject {
  
  def blur(): js.Promise[Unit] = js.native
  
  def exists(): js.Promise[Boolean] = js.native
  
  def focus(): js.Promise[Unit] = js.native
  
  /** @deprecated  Should be private */
  def inputWrapper(): js.Promise[Any] = js.native
  
  var isDisabled: js.Function0[js.Promise[Boolean]] = js.native
  
  def isEditable(): js.Promise[Boolean] = js.native
  
  var isReadOnly: js.Function0[js.Promise[Any]] = js.native
  
  def outsideClick(): js.Promise[Unit] = js.native
  
  def pressKey(key: String): js.Promise[Unit] = js.native
  
  def selectOptionById(id: String): js.Promise[Unit] = js.native
  def selectOptionById(id: Double): js.Promise[Unit] = js.native
}
