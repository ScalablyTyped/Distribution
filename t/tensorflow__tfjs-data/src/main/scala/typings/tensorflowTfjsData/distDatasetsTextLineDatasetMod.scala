package typings.tensorflowTfjsData

import typings.tensorflowTfjsData.distDatasetMod.Dataset
import typings.tensorflowTfjsData.distDatasourceMod.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDatasetsTextLineDatasetMod {
  
  @JSImport("@tensorflow/tfjs-data/dist/datasets/text_line_dataset", "TextLineDataset")
  @js.native
  open class TextLineDataset protected () extends Dataset[String] {
    /**
      * Create a `TextLineDataset`.
      *
      * @param input A `DataSource` providing a chunked, UTF8-encoded byte stream.
      */
    def this(input: DataSource) = this()
    
    /* protected */ val input: DataSource = js.native
  }
}
