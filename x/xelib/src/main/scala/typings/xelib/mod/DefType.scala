package typings.xelib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DefType extends StObject
@JSImport("xelib", "DefType")
@js.native
object DefType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DefType & Double] = js.native
  
  @js.native
  sealed trait dtArray
    extends StObject
       with DefType
  /* 14 */ val dtArray: typings.xelib.mod.DefType.dtArray & Double = js.native
  
  @js.native
  sealed trait dtByteArray
    extends StObject
       with DefType
  /* 8 */ val dtByteArray: typings.xelib.mod.DefType.dtByteArray & Double = js.native
  
  @js.native
  sealed trait dtEmpty
    extends StObject
       with DefType
  /* 17 */ val dtEmpty: typings.xelib.mod.DefType.dtEmpty & Double = js.native
  
  @js.native
  sealed trait dtFlag
    extends StObject
       with DefType
  /* 12 */ val dtFlag: typings.xelib.mod.DefType.dtFlag & Double = js.native
  
  @js.native
  sealed trait dtFloat
    extends StObject
       with DefType
  /* 13 */ val dtFloat: typings.xelib.mod.DefType.dtFloat & Double = js.native
  
  @js.native
  sealed trait dtInteger
    extends StObject
       with DefType
  /* 9 */ val dtInteger: typings.xelib.mod.DefType.dtInteger & Double = js.native
  
  @js.native
  sealed trait dtIntegerFormater
    extends StObject
       with DefType
  /* 10 */ val dtIntegerFormater: typings.xelib.mod.DefType.dtIntegerFormater & Double = js.native
  
  @js.native
  sealed trait dtIntegerFormaterUnion
    extends StObject
       with DefType
  /* 11 */ val dtIntegerFormaterUnion: typings.xelib.mod.DefType.dtIntegerFormaterUnion & Double = js.native
  
  @js.native
  sealed trait dtLString
    extends StObject
       with DefType
  /* 6 */ val dtLString: typings.xelib.mod.DefType.dtLString & Double = js.native
  
  @js.native
  sealed trait dtLenString
    extends StObject
       with DefType
  /* 7 */ val dtLenString: typings.xelib.mod.DefType.dtLenString & Double = js.native
  
  @js.native
  sealed trait dtString
    extends StObject
       with DefType
  /* 5 */ val dtString: typings.xelib.mod.DefType.dtString & Double = js.native
  
  @js.native
  sealed trait dtStruct
    extends StObject
       with DefType
  /* 15 */ val dtStruct: typings.xelib.mod.DefType.dtStruct & Double = js.native
  
  @js.native
  sealed trait dtStructChapter
    extends StObject
       with DefType
  /* 18 */ val dtStructChapter: typings.xelib.mod.DefType.dtStructChapter & Double = js.native
  
  @js.native
  sealed trait dtSubRecord
    extends StObject
       with DefType
  /* 1 */ val dtSubRecord: typings.xelib.mod.DefType.dtSubRecord & Double = js.native
  
  @js.native
  sealed trait dtSubRecordArray
    extends StObject
       with DefType
  /* 2 */ val dtSubRecordArray: typings.xelib.mod.DefType.dtSubRecordArray & Double = js.native
  
  @js.native
  sealed trait dtSubRecordStruct
    extends StObject
       with DefType
  /* 3 */ val dtSubRecordStruct: typings.xelib.mod.DefType.dtSubRecordStruct & Double = js.native
  
  @js.native
  sealed trait dtSubRecordUnion
    extends StObject
       with DefType
  /* 4 */ val dtSubRecordUnion: typings.xelib.mod.DefType.dtSubRecordUnion & Double = js.native
  
  @js.native
  sealed trait dtUnion
    extends StObject
       with DefType
  /* 16 */ val dtUnion: typings.xelib.mod.DefType.dtUnion & Double = js.native
}
