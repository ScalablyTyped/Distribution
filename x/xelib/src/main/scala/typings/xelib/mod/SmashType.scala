package typings.xelib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SmashType extends StObject
@JSImport("xelib", "SmashType")
@js.native
object SmashType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmashType with Double] = js.native
  
  @js.native
  sealed trait stByteArray extends SmashType
  /* 11 */ val stByteArray: typings.xelib.mod.SmashType.stByteArray with Double = js.native
  
  @js.native
  sealed trait stFlag extends SmashType
  /* 4 */ val stFlag: typings.xelib.mod.SmashType.stFlag with Double = js.native
  
  @js.native
  sealed trait stFloat extends SmashType
  /* 5 */ val stFloat: typings.xelib.mod.SmashType.stFloat with Double = js.native
  
  @js.native
  sealed trait stInteger extends SmashType
  /* 3 */ val stInteger: typings.xelib.mod.SmashType.stInteger with Double = js.native
  
  @js.native
  sealed trait stRecord extends SmashType
  /* 1 */ val stRecord: typings.xelib.mod.SmashType.stRecord with Double = js.native
  
  @js.native
  sealed trait stSortedArray extends SmashType
  /* 9 */ val stSortedArray: typings.xelib.mod.SmashType.stSortedArray with Double = js.native
  
  @js.native
  sealed trait stSortedStructArray extends SmashType
  /* 10 */ val stSortedStructArray: typings.xelib.mod.SmashType.stSortedStructArray with Double = js.native
  
  @js.native
  sealed trait stString extends SmashType
  /* 2 */ val stString: typings.xelib.mod.SmashType.stString with Double = js.native
  
  @js.native
  sealed trait stStruct extends SmashType
  /* 6 */ val stStruct: typings.xelib.mod.SmashType.stStruct with Double = js.native
  
  @js.native
  sealed trait stUnion extends SmashType
  /* 12 */ val stUnion: typings.xelib.mod.SmashType.stUnion with Double = js.native
  
  @js.native
  sealed trait stUnknown extends SmashType
  /* 0 */ val stUnknown: typings.xelib.mod.SmashType.stUnknown with Double = js.native
  
  @js.native
  sealed trait stUnsortedArray extends SmashType
  /* 7 */ val stUnsortedArray: typings.xelib.mod.SmashType.stUnsortedArray with Double = js.native
  
  @js.native
  sealed trait stUnsortedStructArray extends SmashType
  /* 8 */ val stUnsortedStructArray: typings.xelib.mod.SmashType.stUnsortedStructArray with Double = js.native
}
