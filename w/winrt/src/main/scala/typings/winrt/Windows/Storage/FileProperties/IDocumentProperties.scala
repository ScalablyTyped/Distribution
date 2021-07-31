package typings.winrt.Windows.Storage.FileProperties

import typings.winrt.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDocumentProperties
  extends StObject
     with IStorageItemExtraProperties {
  
  var author: IVector[String] = js.native
  
  var comment: String = js.native
  
  var keywords: IVector[String] = js.native
  
  var title: String = js.native
}
