package typings.xelib.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ElementType extends js.Object
@JSImport("xelib", "ElementType")
@js.native
object ElementType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ElementType with Double] = js.native
  
  @js.native
  sealed trait etArray extends ElementType
  /* 7 */ @js.native
  object etArray extends TopLevel[etArray with Double]
  
  @js.native
  sealed trait etFile extends ElementType
  /* 0 */ @js.native
  object etFile extends TopLevel[etFile with Double]
  
  @js.native
  sealed trait etFlag extends ElementType
  /* 10 */ @js.native
  object etFlag extends TopLevel[etFlag with Double]
  
  @js.native
  sealed trait etGroupRecord extends ElementType
  /* 2 */ @js.native
  object etGroupRecord extends TopLevel[etGroupRecord with Double]
  
  @js.native
  sealed trait etMainRecord extends ElementType
  /* 1 */ @js.native
  object etMainRecord extends TopLevel[etMainRecord with Double]
  
  @js.native
  sealed trait etStringListTerminator extends ElementType
  /* 11 */ @js.native
  object etStringListTerminator extends TopLevel[etStringListTerminator with Double]
  
  @js.native
  sealed trait etStruct extends ElementType
  /* 8 */ @js.native
  object etStruct extends TopLevel[etStruct with Double]
  
  @js.native
  sealed trait etStructChapter extends ElementType
  /* 13 */ @js.native
  object etStructChapter extends TopLevel[etStructChapter with Double]
  
  @js.native
  sealed trait etSubRecord extends ElementType
  /* 3 */ @js.native
  object etSubRecord extends TopLevel[etSubRecord with Double]
  
  @js.native
  sealed trait etSubRecordArray extends ElementType
  /* 5 */ @js.native
  object etSubRecordArray extends TopLevel[etSubRecordArray with Double]
  
  @js.native
  sealed trait etSubRecordStruct extends ElementType
  /* 4 */ @js.native
  object etSubRecordStruct extends TopLevel[etSubRecordStruct with Double]
  
  @js.native
  sealed trait etSubRecordUnion extends ElementType
  /* 6 */ @js.native
  object etSubRecordUnion extends TopLevel[etSubRecordUnion with Double]
  
  @js.native
  sealed trait etUnion extends ElementType
  /* 12 */ @js.native
  object etUnion extends TopLevel[etUnion with Double]
  
  @js.native
  sealed trait etValue extends ElementType
  /* 9 */ @js.native
  object etValue extends TopLevel[etValue with Double]
}
