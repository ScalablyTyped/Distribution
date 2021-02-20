package typings.xelib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DefType extends StObject
@JSImport("xelib", "DefType")
@js.native
object DefType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DefType with Double] = js.native
  
  @js.native
  sealed trait dtArray extends DefType
  /* 14 */ val dtArray: typings.xelib.mod.DefType.dtArray with Double = js.native
  
  @js.native
  sealed trait dtByteArray extends DefType
  /* 8 */ val dtByteArray: typings.xelib.mod.DefType.dtByteArray with Double = js.native
  
  @js.native
  sealed trait dtEmpty extends DefType
  /* 17 */ val dtEmpty: typings.xelib.mod.DefType.dtEmpty with Double = js.native
  
  @js.native
  sealed trait dtFlag extends DefType
  /* 12 */ val dtFlag: typings.xelib.mod.DefType.dtFlag with Double = js.native
  
  @js.native
  sealed trait dtFloat extends DefType
  /* 13 */ val dtFloat: typings.xelib.mod.DefType.dtFloat with Double = js.native
  
  @js.native
  sealed trait dtInteger extends DefType
  /* 9 */ val dtInteger: typings.xelib.mod.DefType.dtInteger with Double = js.native
  
  @js.native
  sealed trait dtIntegerFormater extends DefType
  /* 10 */ val dtIntegerFormater: typings.xelib.mod.DefType.dtIntegerFormater with Double = js.native
  
  @js.native
  sealed trait dtIntegerFormaterUnion extends DefType
  /* 11 */ val dtIntegerFormaterUnion: typings.xelib.mod.DefType.dtIntegerFormaterUnion with Double = js.native
  
  @js.native
  sealed trait dtLString extends DefType
  /* 6 */ val dtLString: typings.xelib.mod.DefType.dtLString with Double = js.native
  
  @js.native
  sealed trait dtLenString extends DefType
  /* 7 */ val dtLenString: typings.xelib.mod.DefType.dtLenString with Double = js.native
  
  @js.native
  sealed trait dtString extends DefType
  /* 5 */ val dtString: typings.xelib.mod.DefType.dtString with Double = js.native
  
  @js.native
  sealed trait dtStruct extends DefType
  /* 15 */ val dtStruct: typings.xelib.mod.DefType.dtStruct with Double = js.native
  
  @js.native
  sealed trait dtStructChapter extends DefType
  /* 18 */ val dtStructChapter: typings.xelib.mod.DefType.dtStructChapter with Double = js.native
  
  @js.native
  sealed trait dtSubRecord extends DefType
  /* 1 */ val dtSubRecord: typings.xelib.mod.DefType.dtSubRecord with Double = js.native
  
  @js.native
  sealed trait dtSubRecordArray extends DefType
  /* 2 */ val dtSubRecordArray: typings.xelib.mod.DefType.dtSubRecordArray with Double = js.native
  
  @js.native
  sealed trait dtSubRecordStruct extends DefType
  /* 3 */ val dtSubRecordStruct: typings.xelib.mod.DefType.dtSubRecordStruct with Double = js.native
  
  @js.native
  sealed trait dtSubRecordUnion extends DefType
  /* 4 */ val dtSubRecordUnion: typings.xelib.mod.DefType.dtSubRecordUnion with Double = js.native
  
  @js.native
  sealed trait dtUnion extends DefType
  /* 16 */ val dtUnion: typings.xelib.mod.DefType.dtUnion with Double = js.native
}
