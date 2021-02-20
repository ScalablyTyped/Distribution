package typings.uuidJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uuid-js", JSImport.Namespace)
  @js.native
  class ^ () extends uuid
  @JSImport("uuid-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("uuid-js", "create")
  @js.native
  def create(): uuid = js.native
  @JSImport("uuid-js", "create")
  @js.native
  def create(version: Double): uuid = js.native
  
  /* static member */
  @JSImport("uuid-js", "firstFromTime")
  @js.native
  def firstFromTime(time: Double): uuid = js.native
  
  /* static member */
  @JSImport("uuid-js", "fromBinary")
  @js.native
  def fromBinary(binary: js.Any): uuid = js.native
  
  /* static member */
  @JSImport("uuid-js", "fromBytes")
  @js.native
  def fromBytes(ints: js.Array[Double]): uuid = js.native
  
  /* static member */
  @JSImport("uuid-js", "fromTime")
  @js.native
  def fromTime(time: Double): uuid = js.native
  @JSImport("uuid-js", "fromTime")
  @js.native
  def fromTime(time: Double, last: Boolean): uuid = js.native
  
  /* static member */
  @JSImport("uuid-js", "fromURN")
  @js.native
  def fromURN(strId: js.Any): uuid = js.native
  
  /* static member */
  @JSImport("uuid-js", "getTimeFieldValues")
  @js.native
  def getTimeFieldValues(time: js.Any): js.Any = js.native
  
  /* static member */
  @JSImport("uuid-js", "lastFromTime")
  @js.native
  def lastFromTime(time: js.Any): uuid = js.native
  
  /* static member */
  @JSImport("uuid-js", "limitUI04")
  @js.native
  def limitUI04: Double = js.native
  @scala.inline
  def limitUI04_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("limitUI04")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("uuid-js", "limitUI06")
  @js.native
  def limitUI06: Double = js.native
  @scala.inline
  def limitUI06_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("limitUI06")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("uuid-js", "limitUI08")
  @js.native
  def limitUI08: Double = js.native
  @scala.inline
  def limitUI08_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("limitUI08")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("uuid-js", "limitUI12")
  @js.native
  def limitUI12: Double = js.native
  @scala.inline
  def limitUI12_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("limitUI12")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("uuid-js", "limitUI14")
  @js.native
  def limitUI14: Double = js.native
  @scala.inline
  def limitUI14_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("limitUI14")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("uuid-js", "limitUI16")
  @js.native
  def limitUI16: Double = js.native
  @scala.inline
  def limitUI16_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("limitUI16")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("uuid-js", "limitUI32")
  @js.native
  def limitUI32: Double = js.native
  @scala.inline
  def limitUI32_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("limitUI32")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("uuid-js", "limitUI40")
  @js.native
  def limitUI40: Double = js.native
  @scala.inline
  def limitUI40_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("limitUI40")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("uuid-js", "limitUI48")
  @js.native
  def limitUI48: Double = js.native
  @scala.inline
  def limitUI48_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("limitUI48")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("uuid-js", "maxFromBits")
  @js.native
  def maxFromBits(bits: Double): uuid = js.native
  
  /* static member */
  @JSImport("uuid-js", "newTS")
  @js.native
  def newTS(): uuid = js.native
  
  /* static member */
  @JSImport("uuid-js", "paddedString")
  @js.native
  def paddedString(string: js.Any, length: js.Any, z: js.Any): uuid = js.native
  
  /* static member */
  @JSImport("uuid-js", "randomUI04")
  @js.native
  def randomUI04(): uuid = js.native
  
  /* static member */
  @JSImport("uuid-js", "randomUI06")
  @js.native
  def randomUI06(): uuid = js.native
  
  /* static member */
  @JSImport("uuid-js", "randomUI08")
  @js.native
  def randomUI08(): uuid = js.native
  
  /* static member */
  @JSImport("uuid-js", "randomUI12")
  @js.native
  def randomUI12(): uuid = js.native
  
  /* static member */
  @JSImport("uuid-js", "randomUI14")
  @js.native
  def randomUI14(): uuid = js.native
  
  /* static member */
  @JSImport("uuid-js", "randomUI16")
  @js.native
  def randomUI16(): uuid = js.native
  
  /* static member */
  @JSImport("uuid-js", "randomUI32")
  @js.native
  def randomUI32(): uuid = js.native
  
  /* static member */
  @JSImport("uuid-js", "randomUI40")
  @js.native
  def randomUI40(): uuid = js.native
  
  /* static member */
  @JSImport("uuid-js", "randomUI48")
  @js.native
  def randomUI48(): uuid = js.native
  
  @js.native
  trait uuid extends StObject {
    
    def equals(uuid: uuid): Boolean = js.native
    
    def fromParts(
      timeLow: js.Any,
      timeMid: js.Any,
      timeHiAndVersion: js.Any,
      clockSeqHiAndReserved: js.Any,
      clockSeqLow: js.Any,
      node: js.Any
    ): uuid = js.native
    
    def toBytes(): js.Array[_] = js.native
    
    def toURN(): String = js.native
  }
  object uuid {
    
    @scala.inline
    def apply(
      equals_ : uuid => Boolean,
      fromParts: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => uuid,
      toBytes: () => js.Array[_],
      toURN: () => String
    ): uuid = {
      val __obj = js.Dynamic.literal(fromParts = js.Any.fromFunction6(fromParts), toBytes = js.Any.fromFunction0(toBytes), toURN = js.Any.fromFunction0(toURN))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[uuid]
    }
    
    @scala.inline
    implicit class uuidMutableBuilder[Self <: uuid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEquals_(value: uuid => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFromParts(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => uuid): Self = StObject.set(x, "fromParts", js.Any.fromFunction6(value))
      
      @scala.inline
      def setToBytes(value: () => js.Array[_]): Self = StObject.set(x, "toBytes", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToURN(value: () => String): Self = StObject.set(x, "toURN", js.Any.fromFunction0(value))
    }
  }
}
