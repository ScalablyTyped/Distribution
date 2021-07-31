package typings.tensorflowTfjsData

import typings.tensorflowTfjsData.byteChunkIteratorMod.ByteChunkIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datasourceMod {
  
  @JSImport("@tensorflow/tfjs-data/dist/datasource", "DataSource")
  @js.native
  abstract class DataSource () extends StObject {
    
    /**
      * Obtain a new stream of binary data chunks.
      *
      * Starts the new stream from the beginning of the data source, even if other
      * streams have been obtained previously.
      */
    def iterator(): js.Promise[ByteChunkIterator] = js.native
  }
}
