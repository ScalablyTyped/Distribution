package typings.vectorObject

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vector-object", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Vector {
    def this(`object`: js.Object) = this()
    
    /* CompleteClass */
    override def add(vector: Vector): Vector = js.native
    
    /* CompleteClass */
    override def divide(scalar: Double): Vector = js.native
    
    /* CompleteClass */
    override def get(component: String): Any = js.native
    
    /* CompleteClass */
    override def getComponents(): js.Array[String] = js.native
    
    /* CompleteClass */
    override def getCosineSimilarity(vector: Vector): Double = js.native
    
    /* CompleteClass */
    override def getDistance(vector: Vector): Double = js.native
    
    /* CompleteClass */
    override def getDotProduct(vector: Vector): Double = js.native
    
    /* CompleteClass */
    override def getLength(): Double = js.native
    
    /* CompleteClass */
    override def isEqual(vector: Vector): Boolean = js.native
    
    /* CompleteClass */
    override def multiply(scalar: Double): Vector = js.native
    
    /* CompleteClass */
    override def normalize(): Vector = js.native
    
    /* CompleteClass */
    override def set(component: String, value: Any): Unit = js.native
    
    /* CompleteClass */
    override def subtract(vector: Vector): Vector = js.native
    
    /* CompleteClass */
    override def toObject(): js.Object = js.native
    
    /* CompleteClass */
    var vector: js.Object = js.native
  }
  
  trait Vector extends StObject {
    
    def add(vector: Vector): Vector
    
    def divide(scalar: Double): Vector
    
    def get(component: String): Any
    
    def getComponents(): js.Array[String]
    
    def getCosineSimilarity(vector: Vector): Double
    
    def getDistance(vector: Vector): Double
    
    def getDotProduct(vector: Vector): Double
    
    def getLength(): Double
    
    def isEqual(vector: Vector): Boolean
    
    def multiply(scalar: Double): Vector
    
    def normalize(): Vector
    
    def set(component: String, value: Any): Unit
    
    def subtract(vector: Vector): Vector
    
    def toObject(): js.Object
    
    var vector: js.Object
  }
  object Vector {
    
    inline def apply(
      add: Vector => Vector,
      divide: Double => Vector,
      get: String => Any,
      getComponents: () => js.Array[String],
      getCosineSimilarity: Vector => Double,
      getDistance: Vector => Double,
      getDotProduct: Vector => Double,
      getLength: () => Double,
      isEqual: Vector => Boolean,
      multiply: Double => Vector,
      normalize: () => Vector,
      set: (String, Any) => Unit,
      subtract: Vector => Vector,
      toObject: () => js.Object,
      vector: js.Object
    ): Vector = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), divide = js.Any.fromFunction1(divide), get = js.Any.fromFunction1(get), getComponents = js.Any.fromFunction0(getComponents), getCosineSimilarity = js.Any.fromFunction1(getCosineSimilarity), getDistance = js.Any.fromFunction1(getDistance), getDotProduct = js.Any.fromFunction1(getDotProduct), getLength = js.Any.fromFunction0(getLength), isEqual = js.Any.fromFunction1(isEqual), multiply = js.Any.fromFunction1(multiply), normalize = js.Any.fromFunction0(normalize), set = js.Any.fromFunction2(set), subtract = js.Any.fromFunction1(subtract), toObject = js.Any.fromFunction0(toObject), vector = vector.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vector]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Vector] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: Vector => Vector): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setDivide(value: Double => Vector): Self = StObject.set(x, "divide", js.Any.fromFunction1(value))
      
      inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetComponents(value: () => js.Array[String]): Self = StObject.set(x, "getComponents", js.Any.fromFunction0(value))
      
      inline def setGetCosineSimilarity(value: Vector => Double): Self = StObject.set(x, "getCosineSimilarity", js.Any.fromFunction1(value))
      
      inline def setGetDistance(value: Vector => Double): Self = StObject.set(x, "getDistance", js.Any.fromFunction1(value))
      
      inline def setGetDotProduct(value: Vector => Double): Self = StObject.set(x, "getDotProduct", js.Any.fromFunction1(value))
      
      inline def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
      
      inline def setIsEqual(value: Vector => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
      
      inline def setMultiply(value: Double => Vector): Self = StObject.set(x, "multiply", js.Any.fromFunction1(value))
      
      inline def setNormalize(value: () => Vector): Self = StObject.set(x, "normalize", js.Any.fromFunction0(value))
      
      inline def setSet(value: (String, Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setSubtract(value: Vector => Vector): Self = StObject.set(x, "subtract", js.Any.fromFunction1(value))
      
      inline def setToObject(value: () => js.Object): Self = StObject.set(x, "toObject", js.Any.fromFunction0(value))
      
      inline def setVector(value: js.Object): Self = StObject.set(x, "vector", value.asInstanceOf[js.Any])
    }
  }
}
