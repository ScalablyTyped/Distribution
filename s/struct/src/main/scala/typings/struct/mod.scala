package typings.struct

import typings.node.bufferMod.global.Buffer
import typings.struct.structStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("struct", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](): Struct[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Struct[T]]
  
  @JSImport("struct", "Struct")
  @js.native
  open class Struct[T] () extends StObject {
    
    def allocate(): Struct[T] = js.native
    
    def array(name: String, length: Double, `type`: StructTypes, args: (String | Double | Struct[Any])*): Struct[T] = js.native
    def array(name: String, length: Double, `type`: Struct[Any], args: (String | Double | Struct[Any])*): Struct[T] = js.native
    
    def buffer(): Buffer = js.native
    
    def chars(name: String, length: Double): Struct[T] = js.native
    def chars(name: String, length: Double, encoding: String): Struct[T] = js.native
    
    def charsnt(name: String, length: Double): Struct[T] = js.native
    def charsnt(name: String, length: Double, encoding: String): Struct[T] = js.native
    
    def doublebe(name: String): Struct[T] = js.native
    
    def doublele(name: String): Struct[T] = js.native
    
    var fields: T = js.native
    
    def floatbe(name: String): Struct[T] = js.native
    
    def floatle(name: String): Struct[T] = js.native
    
    def get(fieldName: String): Any = js.native
    
    def set(fieldName: String, value: Any): Unit = js.native
    
    def setBuffer(buffer: Buffer): Unit = js.native
    def setBuffer(buffer: Buffer, buffLength: Double): Unit = js.native
    
    def struct(name: String, struct: Struct[Any]): Struct[T] = js.native
    
    def word16Sbe(name: String): Struct[T] = js.native
    
    def word16Sle(name: String): Struct[T] = js.native
    
    def word16Ube(name: String): Struct[T] = js.native
    
    def word16Ule(name: String): Struct[T] = js.native
    
    def word32Sbe(name: String): Struct[T] = js.native
    
    def word32Sle(name: String): Struct[T] = js.native
    
    def word32Ube(name: String): Struct[T] = js.native
    
    def word32Ule(name: String): Struct[T] = js.native
    
    def word64Sbe(name: String): Struct[T] = js.native
    
    def word64Sle(name: String): Struct[T] = js.native
    
    def word64Ube(name: String): Struct[T] = js.native
    
    def word64Ule(name: String): Struct[T] = js.native
    
    def word8(name: String): Struct[T] = js.native
    
    def word8Sbe(name: String): Struct[T] = js.native
    
    def word8Sle(name: String): Struct[T] = js.native
  }
  
  type StructArrayType = array
  
  /* Rewritten from type alias, can be one of: 
    - typings.struct.structStrings.word8
    - typings.struct.structStrings.word8Sle
    - typings.struct.structStrings.word8Sbe
    - typings.struct.structStrings.word16Sle
    - typings.struct.structStrings.word16Sbe
    - typings.struct.structStrings.word16Ule
    - typings.struct.structStrings.word16Ube
    - typings.struct.structStrings.word32Sle
    - typings.struct.structStrings.word32Sbe
    - typings.struct.structStrings.word32Ule
    - typings.struct.structStrings.word32Ube
    - typings.struct.structStrings.word64Sle
    - typings.struct.structStrings.word64Sbe
    - typings.struct.structStrings.word64Ule
    - typings.struct.structStrings.word64Ube
    - typings.struct.structStrings.floatle
    - typings.struct.structStrings.floatbe
    - typings.struct.structStrings.doublele
    - typings.struct.structStrings.doublebe
  */
  trait StructBaseTypes
    extends StObject
       with _StructTypes
  object StructBaseTypes {
    
    inline def doublebe: typings.struct.structStrings.doublebe = "doublebe".asInstanceOf[typings.struct.structStrings.doublebe]
    
    inline def doublele: typings.struct.structStrings.doublele = "doublele".asInstanceOf[typings.struct.structStrings.doublele]
    
    inline def floatbe: typings.struct.structStrings.floatbe = "floatbe".asInstanceOf[typings.struct.structStrings.floatbe]
    
    inline def floatle: typings.struct.structStrings.floatle = "floatle".asInstanceOf[typings.struct.structStrings.floatle]
    
    inline def word16Sbe: typings.struct.structStrings.word16Sbe = "word16Sbe".asInstanceOf[typings.struct.structStrings.word16Sbe]
    
    inline def word16Sle: typings.struct.structStrings.word16Sle = "word16Sle".asInstanceOf[typings.struct.structStrings.word16Sle]
    
    inline def word16Ube: typings.struct.structStrings.word16Ube = "word16Ube".asInstanceOf[typings.struct.structStrings.word16Ube]
    
    inline def word16Ule: typings.struct.structStrings.word16Ule = "word16Ule".asInstanceOf[typings.struct.structStrings.word16Ule]
    
    inline def word32Sbe: typings.struct.structStrings.word32Sbe = "word32Sbe".asInstanceOf[typings.struct.structStrings.word32Sbe]
    
    inline def word32Sle: typings.struct.structStrings.word32Sle = "word32Sle".asInstanceOf[typings.struct.structStrings.word32Sle]
    
    inline def word32Ube: typings.struct.structStrings.word32Ube = "word32Ube".asInstanceOf[typings.struct.structStrings.word32Ube]
    
    inline def word32Ule: typings.struct.structStrings.word32Ule = "word32Ule".asInstanceOf[typings.struct.structStrings.word32Ule]
    
    inline def word64Sbe: typings.struct.structStrings.word64Sbe = "word64Sbe".asInstanceOf[typings.struct.structStrings.word64Sbe]
    
    inline def word64Sle: typings.struct.structStrings.word64Sle = "word64Sle".asInstanceOf[typings.struct.structStrings.word64Sle]
    
    inline def word64Ube: typings.struct.structStrings.word64Ube = "word64Ube".asInstanceOf[typings.struct.structStrings.word64Ube]
    
    inline def word64Ule: typings.struct.structStrings.word64Ule = "word64Ule".asInstanceOf[typings.struct.structStrings.word64Ule]
    
    inline def word8: typings.struct.structStrings.word8 = "word8".asInstanceOf[typings.struct.structStrings.word8]
    
    inline def word8Sbe: typings.struct.structStrings.word8Sbe = "word8Sbe".asInstanceOf[typings.struct.structStrings.word8Sbe]
    
    inline def word8Sle: typings.struct.structStrings.word8Sle = "word8Sle".asInstanceOf[typings.struct.structStrings.word8Sle]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.struct.structStrings.chars
    - typings.struct.structStrings.charsnt
  */
  trait StructCharsTypes
    extends StObject
       with _StructTypes
  object StructCharsTypes {
    
    inline def chars: typings.struct.structStrings.chars = "chars".asInstanceOf[typings.struct.structStrings.chars]
    
    inline def charsnt: typings.struct.structStrings.charsnt = "charsnt".asInstanceOf[typings.struct.structStrings.charsnt]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.struct.mod.StructBaseTypes
    - typings.struct.mod.StructCharsTypes
    - typings.struct.mod.StructArrayType
  */
  type StructTypes = _StructTypes | StructArrayType
  
  trait _StructTypes extends StObject
}
