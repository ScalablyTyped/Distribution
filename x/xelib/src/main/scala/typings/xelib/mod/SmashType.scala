package typings.xelib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SmashType extends StObject
@JSImport("xelib", "SmashType")
@js.native
object SmashType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmashType & Double] = js.native
  
  @js.native
  sealed trait stByteArray
    extends StObject
       with SmashType
  /* 11 */ val stByteArray: typings.xelib.mod.SmashType.stByteArray & Double = js.native
  
  @js.native
  sealed trait stFlag
    extends StObject
       with SmashType
  /* 4 */ val stFlag: typings.xelib.mod.SmashType.stFlag & Double = js.native
  
  @js.native
  sealed trait stFloat
    extends StObject
       with SmashType
  /* 5 */ val stFloat: typings.xelib.mod.SmashType.stFloat & Double = js.native
  
  @js.native
  sealed trait stInteger
    extends StObject
       with SmashType
  /* 3 */ val stInteger: typings.xelib.mod.SmashType.stInteger & Double = js.native
  
  @js.native
  sealed trait stRecord
    extends StObject
       with SmashType
  /* 1 */ val stRecord: typings.xelib.mod.SmashType.stRecord & Double = js.native
  
  @js.native
  sealed trait stSortedArray
    extends StObject
       with SmashType
  /* 9 */ val stSortedArray: typings.xelib.mod.SmashType.stSortedArray & Double = js.native
  
  @js.native
  sealed trait stSortedStructArray
    extends StObject
       with SmashType
  /* 10 */ val stSortedStructArray: typings.xelib.mod.SmashType.stSortedStructArray & Double = js.native
  
  @js.native
  sealed trait stString
    extends StObject
       with SmashType
  /* 2 */ val stString: typings.xelib.mod.SmashType.stString & Double = js.native
  
  @js.native
  sealed trait stStruct
    extends StObject
       with SmashType
  /* 6 */ val stStruct: typings.xelib.mod.SmashType.stStruct & Double = js.native
  
  @js.native
  sealed trait stUnion
    extends StObject
       with SmashType
  /* 12 */ val stUnion: typings.xelib.mod.SmashType.stUnion & Double = js.native
  
  @js.native
  sealed trait stUnknown
    extends StObject
       with SmashType
  /* 0 */ val stUnknown: typings.xelib.mod.SmashType.stUnknown & Double = js.native
  
  @js.native
  sealed trait stUnsortedArray
    extends StObject
       with SmashType
  /* 7 */ val stUnsortedArray: typings.xelib.mod.SmashType.stUnsortedArray & Double = js.native
  
  @js.native
  sealed trait stUnsortedStructArray
    extends StObject
       with SmashType
  /* 8 */ val stUnsortedStructArray: typings.xelib.mod.SmashType.stUnsortedStructArray & Double = js.native
}
