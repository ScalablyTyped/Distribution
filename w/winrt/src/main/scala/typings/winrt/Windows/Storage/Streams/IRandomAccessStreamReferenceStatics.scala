package typings.winrt.Windows.Storage.Streams

import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRandomAccessStreamReferenceStatics extends StObject {
  
  def createFromFile(file: IStorageFile): RandomAccessStreamReference
  
  def createFromStream(stream: IRandomAccessStream): RandomAccessStreamReference
  
  def createFromUri(uri: Uri): RandomAccessStreamReference
}
object IRandomAccessStreamReferenceStatics {
  
  inline def apply(
    createFromFile: IStorageFile => RandomAccessStreamReference,
    createFromStream: IRandomAccessStream => RandomAccessStreamReference,
    createFromUri: Uri => RandomAccessStreamReference
  ): IRandomAccessStreamReferenceStatics = {
    val __obj = js.Dynamic.literal(createFromFile = js.Any.fromFunction1(createFromFile), createFromStream = js.Any.fromFunction1(createFromStream), createFromUri = js.Any.fromFunction1(createFromUri))
    __obj.asInstanceOf[IRandomAccessStreamReferenceStatics]
  }
  
  extension [Self <: IRandomAccessStreamReferenceStatics](x: Self) {
    
    inline def setCreateFromFile(value: IStorageFile => RandomAccessStreamReference): Self = StObject.set(x, "createFromFile", js.Any.fromFunction1(value))
    
    inline def setCreateFromStream(value: IRandomAccessStream => RandomAccessStreamReference): Self = StObject.set(x, "createFromStream", js.Any.fromFunction1(value))
    
    inline def setCreateFromUri(value: Uri => RandomAccessStreamReference): Self = StObject.set(x, "createFromUri", js.Any.fromFunction1(value))
  }
}
