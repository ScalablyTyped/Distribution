package typings.three

import typings.std.ArrayLike
import typings.three.threeMod.Matrix3
import typings.three.threeStrings.x_
import typings.three.threeStrings.y_
import typings.three.threeStrings.z_
import typings.three.volumeSliceMod.VolumeSlice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object volumeMod {
  
  @JSImport("three/examples/jsm/misc/Volume", "Volume")
  @js.native
  open class Volume () extends StObject {
    def this(xLength: Double) = this()
    def this(xLength: Double, yLength: Double) = this()
    def this(xLength: Unit, yLength: Double) = this()
    def this(xLength: Double, yLength: Double, zLength: Double) = this()
    def this(xLength: Double, yLength: Unit, zLength: Double) = this()
    def this(xLength: Unit, yLength: Double, zLength: Double) = this()
    def this(xLength: Unit, yLength: Unit, zLength: Double) = this()
    def this(xLength: Double, yLength: Double, zLength: Double, `type`: String) = this()
    def this(xLength: Double, yLength: Double, zLength: Unit, `type`: String) = this()
    def this(xLength: Double, yLength: Unit, zLength: Double, `type`: String) = this()
    def this(xLength: Double, yLength: Unit, zLength: Unit, `type`: String) = this()
    def this(xLength: Unit, yLength: Double, zLength: Double, `type`: String) = this()
    def this(xLength: Unit, yLength: Double, zLength: Unit, `type`: String) = this()
    def this(xLength: Unit, yLength: Unit, zLength: Double, `type`: String) = this()
    def this(xLength: Unit, yLength: Unit, zLength: Unit, `type`: String) = this()
    def this(xLength: Double, yLength: Double, zLength: Double, `type`: String, arrayBuffer: ArrayLike[Double]) = this()
    def this(xLength: Double, yLength: Double, zLength: Double, `type`: Unit, arrayBuffer: ArrayLike[Double]) = this()
    def this(xLength: Double, yLength: Double, zLength: Unit, `type`: String, arrayBuffer: ArrayLike[Double]) = this()
    def this(xLength: Double, yLength: Double, zLength: Unit, `type`: Unit, arrayBuffer: ArrayLike[Double]) = this()
    def this(xLength: Double, yLength: Unit, zLength: Double, `type`: String, arrayBuffer: ArrayLike[Double]) = this()
    def this(xLength: Double, yLength: Unit, zLength: Double, `type`: Unit, arrayBuffer: ArrayLike[Double]) = this()
    def this(xLength: Double, yLength: Unit, zLength: Unit, `type`: String, arrayBuffer: ArrayLike[Double]) = this()
    def this(xLength: Double, yLength: Unit, zLength: Unit, `type`: Unit, arrayBuffer: ArrayLike[Double]) = this()
    def this(xLength: Unit, yLength: Double, zLength: Double, `type`: String, arrayBuffer: ArrayLike[Double]) = this()
    def this(xLength: Unit, yLength: Double, zLength: Double, `type`: Unit, arrayBuffer: ArrayLike[Double]) = this()
    def this(xLength: Unit, yLength: Double, zLength: Unit, `type`: String, arrayBuffer: ArrayLike[Double]) = this()
    def this(xLength: Unit, yLength: Double, zLength: Unit, `type`: Unit, arrayBuffer: ArrayLike[Double]) = this()
    def this(xLength: Unit, yLength: Unit, zLength: Double, `type`: String, arrayBuffer: ArrayLike[Double]) = this()
    def this(xLength: Unit, yLength: Unit, zLength: Double, `type`: Unit, arrayBuffer: ArrayLike[Double]) = this()
    def this(xLength: Unit, yLength: Unit, zLength: Unit, `type`: String, arrayBuffer: ArrayLike[Double]) = this()
    def this(xLength: Unit, yLength: Unit, zLength: Unit, `type`: Unit, arrayBuffer: ArrayLike[Double]) = this()
    
    def access(i: Double, j: Double, k: Double): Double = js.native
    
    var axisOrder: js.Array[x_ | y_ | z_] = js.native
    
    def computeMinMax(): js.Array[Double] = js.native
    
    var data: ArrayLike[Double] = js.native
    
    def extractPerpendicularPlane(axis: String, RASIndex: Double): js.Object = js.native
    
    def extractSlice(axis: String, index: Double): VolumeSlice = js.native
    
    def getData(i: Double, j: Double, k: Double): Double = js.native
    
    var lowerThreshold: Double = js.native
    
    def map(functionToMap: js.Function0[Unit], context: this.type): this.type = js.native
    
    var matrix: Matrix3 = js.native
    
    var offset: js.Array[Double] = js.native
    
    def repaintAllSlices(): this.type = js.native
    
    def reverseAccess(index: Double): js.Array[Double] = js.native
    
    var sliceList: js.Array[VolumeSlice] = js.native
    
    var spacing: js.Array[Double] = js.native
    
    var upperThreshold: Double = js.native
    
    var xLength: Double = js.native
    
    var yLength: Double = js.native
    
    var zLength: Double = js.native
  }
}
