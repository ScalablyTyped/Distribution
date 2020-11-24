package typings.xelib.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SmashType extends js.Object
@JSImport("xelib", "SmashType")
@js.native
object SmashType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmashType with Double] = js.native
  
  @js.native
  sealed trait stByteArray extends SmashType
  /* 11 */ @js.native
  object stByteArray extends TopLevel[stByteArray with Double]
  
  @js.native
  sealed trait stFlag extends SmashType
  /* 4 */ @js.native
  object stFlag extends TopLevel[stFlag with Double]
  
  @js.native
  sealed trait stFloat extends SmashType
  /* 5 */ @js.native
  object stFloat extends TopLevel[stFloat with Double]
  
  @js.native
  sealed trait stInteger extends SmashType
  /* 3 */ @js.native
  object stInteger extends TopLevel[stInteger with Double]
  
  @js.native
  sealed trait stRecord extends SmashType
  /* 1 */ @js.native
  object stRecord extends TopLevel[stRecord with Double]
  
  @js.native
  sealed trait stSortedArray extends SmashType
  /* 9 */ @js.native
  object stSortedArray extends TopLevel[stSortedArray with Double]
  
  @js.native
  sealed trait stSortedStructArray extends SmashType
  /* 10 */ @js.native
  object stSortedStructArray extends TopLevel[stSortedStructArray with Double]
  
  @js.native
  sealed trait stString extends SmashType
  /* 2 */ @js.native
  object stString extends TopLevel[stString with Double]
  
  @js.native
  sealed trait stStruct extends SmashType
  /* 6 */ @js.native
  object stStruct extends TopLevel[stStruct with Double]
  
  @js.native
  sealed trait stUnion extends SmashType
  /* 12 */ @js.native
  object stUnion extends TopLevel[stUnion with Double]
  
  @js.native
  sealed trait stUnknown extends SmashType
  /* 0 */ @js.native
  object stUnknown extends TopLevel[stUnknown with Double]
  
  @js.native
  sealed trait stUnsortedArray extends SmashType
  /* 7 */ @js.native
  object stUnsortedArray extends TopLevel[stUnsortedArray with Double]
  
  @js.native
  sealed trait stUnsortedStructArray extends SmashType
  /* 8 */ @js.native
  object stUnsortedStructArray extends TopLevel[stUnsortedStructArray with Double]
}
