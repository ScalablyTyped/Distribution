package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Atoms extends StObject {
  
  var atoms: js.Array[js.Array[Any]]
}
object Atoms {
  
  inline def apply(atoms: js.Array[js.Array[Any]]): Atoms = {
    val __obj = js.Dynamic.literal(atoms = atoms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Atoms]
  }
  
  extension [Self <: Atoms](x: Self) {
    
    inline def setAtoms(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "atoms", value.asInstanceOf[js.Any])
    
    inline def setAtomsVarargs(value: js.Array[Any]*): Self = StObject.set(x, "atoms", js.Array(value*))
  }
}
