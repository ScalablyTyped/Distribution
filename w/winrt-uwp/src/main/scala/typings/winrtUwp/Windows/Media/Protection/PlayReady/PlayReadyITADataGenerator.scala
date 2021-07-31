package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Creates the PlayReady ITA-specific serialized initialization data. */
trait PlayReadyITADataGenerator extends StObject {
  
  /**
    * Returns a serialized blob of the specified IPropertySet data that the PlayReady ITA can consume if wrapped in a content protection instantiation format.
    * @param guidCPSystemId The content protection system GUID.
    * @param countOfStreams The stream count.
    * @param configuration The data to be returned as a serialized blob.
    * @param format The format for the ITA serialized data.
    * @return The serialized blob. See Remarks.
    */
  def generateData(
    guidCPSystemId: String,
    countOfStreams: Double,
    configuration: IPropertySet,
    format: PlayReadyITADataFormat
  ): js.Array[Double]
}
object PlayReadyITADataGenerator {
  
  @scala.inline
  def apply(generateData: (String, Double, IPropertySet, PlayReadyITADataFormat) => js.Array[Double]): PlayReadyITADataGenerator = {
    val __obj = js.Dynamic.literal(generateData = js.Any.fromFunction4(generateData))
    __obj.asInstanceOf[PlayReadyITADataGenerator]
  }
  
  @scala.inline
  implicit class PlayReadyITADataGeneratorMutableBuilder[Self <: PlayReadyITADataGenerator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGenerateData(value: (String, Double, IPropertySet, PlayReadyITADataFormat) => js.Array[Double]): Self = StObject.set(x, "generateData", js.Any.fromFunction4(value))
  }
}
