package typings.xelib.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DefType extends js.Object
@JSImport("xelib", "DefType")
@js.native
object DefType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DefType with Double] = js.native
  
  @js.native
  sealed trait dtArray extends DefType
  /* 14 */ @js.native
  object dtArray extends TopLevel[dtArray with Double]
  
  @js.native
  sealed trait dtByteArray extends DefType
  /* 8 */ @js.native
  object dtByteArray extends TopLevel[dtByteArray with Double]
  
  @js.native
  sealed trait dtEmpty extends DefType
  /* 17 */ @js.native
  object dtEmpty extends TopLevel[dtEmpty with Double]
  
  @js.native
  sealed trait dtFlag extends DefType
  /* 12 */ @js.native
  object dtFlag extends TopLevel[dtFlag with Double]
  
  @js.native
  sealed trait dtFloat extends DefType
  /* 13 */ @js.native
  object dtFloat extends TopLevel[dtFloat with Double]
  
  @js.native
  sealed trait dtInteger extends DefType
  /* 9 */ @js.native
  object dtInteger extends TopLevel[dtInteger with Double]
  
  @js.native
  sealed trait dtIntegerFormater extends DefType
  /* 10 */ @js.native
  object dtIntegerFormater extends TopLevel[dtIntegerFormater with Double]
  
  @js.native
  sealed trait dtIntegerFormaterUnion extends DefType
  /* 11 */ @js.native
  object dtIntegerFormaterUnion extends TopLevel[dtIntegerFormaterUnion with Double]
  
  @js.native
  sealed trait dtLString extends DefType
  /* 6 */ @js.native
  object dtLString extends TopLevel[dtLString with Double]
  
  @js.native
  sealed trait dtLenString extends DefType
  /* 7 */ @js.native
  object dtLenString extends TopLevel[dtLenString with Double]
  
  @js.native
  sealed trait dtString extends DefType
  /* 5 */ @js.native
  object dtString extends TopLevel[dtString with Double]
  
  @js.native
  sealed trait dtStruct extends DefType
  /* 15 */ @js.native
  object dtStruct extends TopLevel[dtStruct with Double]
  
  @js.native
  sealed trait dtStructChapter extends DefType
  /* 18 */ @js.native
  object dtStructChapter extends TopLevel[dtStructChapter with Double]
  
  @js.native
  sealed trait dtSubRecord extends DefType
  /* 1 */ @js.native
  object dtSubRecord extends TopLevel[dtSubRecord with Double]
  
  @js.native
  sealed trait dtSubRecordArray extends DefType
  /* 2 */ @js.native
  object dtSubRecordArray extends TopLevel[dtSubRecordArray with Double]
  
  @js.native
  sealed trait dtSubRecordStruct extends DefType
  /* 3 */ @js.native
  object dtSubRecordStruct extends TopLevel[dtSubRecordStruct with Double]
  
  @js.native
  sealed trait dtSubRecordUnion extends DefType
  /* 4 */ @js.native
  object dtSubRecordUnion extends TopLevel[dtSubRecordUnion with Double]
  
  @js.native
  sealed trait dtUnion extends DefType
  /* 16 */ @js.native
  object dtUnion extends TopLevel[dtUnion with Double]
}
