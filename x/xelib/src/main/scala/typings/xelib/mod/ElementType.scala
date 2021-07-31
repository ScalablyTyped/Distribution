package typings.xelib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ElementType extends StObject
@JSImport("xelib", "ElementType")
@js.native
object ElementType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ElementType & Double] = js.native
  
  @js.native
  sealed trait etArray
    extends StObject
       with ElementType
  /* 7 */ val etArray: typings.xelib.mod.ElementType.etArray & Double = js.native
  
  @js.native
  sealed trait etFile
    extends StObject
       with ElementType
  /* 0 */ val etFile: typings.xelib.mod.ElementType.etFile & Double = js.native
  
  @js.native
  sealed trait etFlag
    extends StObject
       with ElementType
  /* 10 */ val etFlag: typings.xelib.mod.ElementType.etFlag & Double = js.native
  
  @js.native
  sealed trait etGroupRecord
    extends StObject
       with ElementType
  /* 2 */ val etGroupRecord: typings.xelib.mod.ElementType.etGroupRecord & Double = js.native
  
  @js.native
  sealed trait etMainRecord
    extends StObject
       with ElementType
  /* 1 */ val etMainRecord: typings.xelib.mod.ElementType.etMainRecord & Double = js.native
  
  @js.native
  sealed trait etStringListTerminator
    extends StObject
       with ElementType
  /* 11 */ val etStringListTerminator: typings.xelib.mod.ElementType.etStringListTerminator & Double = js.native
  
  @js.native
  sealed trait etStruct
    extends StObject
       with ElementType
  /* 8 */ val etStruct: typings.xelib.mod.ElementType.etStruct & Double = js.native
  
  @js.native
  sealed trait etStructChapter
    extends StObject
       with ElementType
  /* 13 */ val etStructChapter: typings.xelib.mod.ElementType.etStructChapter & Double = js.native
  
  @js.native
  sealed trait etSubRecord
    extends StObject
       with ElementType
  /* 3 */ val etSubRecord: typings.xelib.mod.ElementType.etSubRecord & Double = js.native
  
  @js.native
  sealed trait etSubRecordArray
    extends StObject
       with ElementType
  /* 5 */ val etSubRecordArray: typings.xelib.mod.ElementType.etSubRecordArray & Double = js.native
  
  @js.native
  sealed trait etSubRecordStruct
    extends StObject
       with ElementType
  /* 4 */ val etSubRecordStruct: typings.xelib.mod.ElementType.etSubRecordStruct & Double = js.native
  
  @js.native
  sealed trait etSubRecordUnion
    extends StObject
       with ElementType
  /* 6 */ val etSubRecordUnion: typings.xelib.mod.ElementType.etSubRecordUnion & Double = js.native
  
  @js.native
  sealed trait etUnion
    extends StObject
       with ElementType
  /* 12 */ val etUnion: typings.xelib.mod.ElementType.etUnion & Double = js.native
  
  @js.native
  sealed trait etValue
    extends StObject
       with ElementType
  /* 9 */ val etValue: typings.xelib.mod.ElementType.etValue & Double = js.native
}
