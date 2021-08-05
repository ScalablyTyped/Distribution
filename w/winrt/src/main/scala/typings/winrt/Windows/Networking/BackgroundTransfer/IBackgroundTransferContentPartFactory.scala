package typings.winrt.Windows.Networking.BackgroundTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBackgroundTransferContentPartFactory extends StObject {
  
  def createWithName(name: String): BackgroundTransferContentPart
  
  def createWithNameAndFileName(name: String, fileName: String): BackgroundTransferContentPart
}
object IBackgroundTransferContentPartFactory {
  
  inline def apply(
    createWithName: String => BackgroundTransferContentPart,
    createWithNameAndFileName: (String, String) => BackgroundTransferContentPart
  ): IBackgroundTransferContentPartFactory = {
    val __obj = js.Dynamic.literal(createWithName = js.Any.fromFunction1(createWithName), createWithNameAndFileName = js.Any.fromFunction2(createWithNameAndFileName))
    __obj.asInstanceOf[IBackgroundTransferContentPartFactory]
  }
  
  extension [Self <: IBackgroundTransferContentPartFactory](x: Self) {
    
    inline def setCreateWithName(value: String => BackgroundTransferContentPart): Self = StObject.set(x, "createWithName", js.Any.fromFunction1(value))
    
    inline def setCreateWithNameAndFileName(value: (String, String) => BackgroundTransferContentPart): Self = StObject.set(x, "createWithNameAndFileName", js.Any.fromFunction2(value))
  }
}
