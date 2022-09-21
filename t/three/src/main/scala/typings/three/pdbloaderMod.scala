package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.anon.Atoms
import typings.three.threeMod.BufferGeometry
import typings.three.threeMod.Loader
import typings.three.threeMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pdbloaderMod {
  
  @JSImport("three/examples/jsm/loaders/PDBLoader", "PDBLoader")
  @js.native
  open class PDBLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String, onLoad: js.Function1[/* pdb */ PDB, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* pdb */ PDB, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* pdb */ PDB, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* pdb */ PDB, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def parse(text: String): PDB = js.native
  }
  
  trait PDB extends StObject {
    
    var geometryAtoms: BufferGeometry
    
    var geometryBonds: BufferGeometry
    
    var json: Atoms
  }
  object PDB {
    
    inline def apply(geometryAtoms: BufferGeometry, geometryBonds: BufferGeometry, json: Atoms): PDB = {
      val __obj = js.Dynamic.literal(geometryAtoms = geometryAtoms.asInstanceOf[js.Any], geometryBonds = geometryBonds.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any])
      __obj.asInstanceOf[PDB]
    }
    
    extension [Self <: PDB](x: Self) {
      
      inline def setGeometryAtoms(value: BufferGeometry): Self = StObject.set(x, "geometryAtoms", value.asInstanceOf[js.Any])
      
      inline def setGeometryBonds(value: BufferGeometry): Self = StObject.set(x, "geometryBonds", value.asInstanceOf[js.Any])
      
      inline def setJson(value: Atoms): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    }
  }
}
