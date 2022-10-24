package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsEditable extends StObject {
  
  def blur(): js.Promise[Unit] = js.native
  
  def exists(): js.Promise[Boolean] = js.native
  
  def focus(): js.Promise[Unit] = js.native
  
  /** @deprecated  Should be private */
  def inputWrapper(): js.Promise[Any] = js.native
  
  var isDisabled: /* import warning: importer.ImportType#apply Failed type conversion: wix-style-react.wix-style-react/dist/types/Input/Input.uni.driver.InputUniDriver['isDisabled'] */ js.Any = js.native
  
  def isEditable(): js.Promise[Boolean] = js.native
  
  var isReadOnly: /* import warning: importer.ImportType#apply Failed type conversion: wix-style-react.wix-style-react/dist/types/Input/Input.uni.driver.InputUniDriver['getReadOnly'] */ js.Any = js.native
  
  def outsideClick(): js.Promise[Unit] = js.native
  
  def pressKey(key: String): js.Promise[Unit] = js.native
  
  def selectOptionById(id: String): js.Promise[Unit] = js.native
  def selectOptionById(id: Double): js.Promise[Unit] = js.native
}
