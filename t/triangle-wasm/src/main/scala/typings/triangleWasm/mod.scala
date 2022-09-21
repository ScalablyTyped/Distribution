package typings.triangleWasm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("triangle-wasm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def freeIO(io: TriangulateIO): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("freeIO")(io.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def freeIO(io: TriangulateIO, all: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("freeIO")(io.asInstanceOf[js.Any], all.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getSwitchesStr(switches: String, input: TriangulateIO): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSwitchesStr")(switches.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSwitchesStr(switches: String, input: TriangulateIO, vorout: TriangulateIO): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSwitchesStr")(switches.asInstanceOf[js.Any], input.asInstanceOf[js.Any], vorout.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSwitchesStr(switches: TriangulateSwitches, input: TriangulateIO): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSwitchesStr")(switches.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSwitchesStr(switches: TriangulateSwitches, input: TriangulateIO, vorout: TriangulateIO): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSwitchesStr")(switches.asInstanceOf[js.Any], input.asInstanceOf[js.Any], vorout.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def init(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[js.Promise[Unit]]
  inline def init(path: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def makeIO(): TriangulateIO = ^.asInstanceOf[js.Dynamic].applyDynamic("makeIO")().asInstanceOf[TriangulateIO]
  inline def makeIO(data: TriangulateData): TriangulateIO = ^.asInstanceOf[js.Dynamic].applyDynamic("makeIO")(data.asInstanceOf[js.Any]).asInstanceOf[TriangulateIO]
  
  inline def triangulate(switches: String, input: TriangulateIO, output: TriangulateIO): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triangulate")(switches.asInstanceOf[js.Any], input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triangulate(switches: String, input: TriangulateIO, output: TriangulateIO, vorout: TriangulateIO): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triangulate")(switches.asInstanceOf[js.Any], input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], vorout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triangulate(switches: TriangulateSwitches, input: TriangulateIO, output: TriangulateIO): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triangulate")(switches.asInstanceOf[js.Any], input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triangulate(switches: TriangulateSwitches, input: TriangulateIO, output: TriangulateIO, vorout: TriangulateIO): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triangulate")(switches.asInstanceOf[js.Any], input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], vorout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait TriangulateData extends StObject {
    
    var edgelist: js.UndefOr[js.Array[Double]] = js.undefined
    
    var edgemarkerlist: js.UndefOr[js.Array[Double]] = js.undefined
    
    var holelist: js.UndefOr[js.Array[Double]] = js.undefined
    
    var neighborlist: js.UndefOr[js.Array[Double]] = js.undefined
    
    var pointattributelist: js.UndefOr[js.Array[Double]] = js.undefined
    
    var pointlist: js.Array[Double]
    
    var pointmarkerlist: js.UndefOr[js.Array[Double]] = js.undefined
    
    var regionlist: js.UndefOr[js.Array[Double]] = js.undefined
    
    var trianglearealist: js.UndefOr[js.Array[Double]] = js.undefined
    
    var triangleattributelist: js.UndefOr[js.Array[Double]] = js.undefined
    
    var trianglelist: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object TriangulateData {
    
    inline def apply(pointlist: js.Array[Double]): TriangulateData = {
      val __obj = js.Dynamic.literal(pointlist = pointlist.asInstanceOf[js.Any])
      __obj.asInstanceOf[TriangulateData]
    }
    
    extension [Self <: TriangulateData](x: Self) {
      
      inline def setEdgelist(value: js.Array[Double]): Self = StObject.set(x, "edgelist", value.asInstanceOf[js.Any])
      
      inline def setEdgelistUndefined: Self = StObject.set(x, "edgelist", js.undefined)
      
      inline def setEdgelistVarargs(value: Double*): Self = StObject.set(x, "edgelist", js.Array(value*))
      
      inline def setEdgemarkerlist(value: js.Array[Double]): Self = StObject.set(x, "edgemarkerlist", value.asInstanceOf[js.Any])
      
      inline def setEdgemarkerlistUndefined: Self = StObject.set(x, "edgemarkerlist", js.undefined)
      
      inline def setEdgemarkerlistVarargs(value: Double*): Self = StObject.set(x, "edgemarkerlist", js.Array(value*))
      
      inline def setHolelist(value: js.Array[Double]): Self = StObject.set(x, "holelist", value.asInstanceOf[js.Any])
      
      inline def setHolelistUndefined: Self = StObject.set(x, "holelist", js.undefined)
      
      inline def setHolelistVarargs(value: Double*): Self = StObject.set(x, "holelist", js.Array(value*))
      
      inline def setNeighborlist(value: js.Array[Double]): Self = StObject.set(x, "neighborlist", value.asInstanceOf[js.Any])
      
      inline def setNeighborlistUndefined: Self = StObject.set(x, "neighborlist", js.undefined)
      
      inline def setNeighborlistVarargs(value: Double*): Self = StObject.set(x, "neighborlist", js.Array(value*))
      
      inline def setPointattributelist(value: js.Array[Double]): Self = StObject.set(x, "pointattributelist", value.asInstanceOf[js.Any])
      
      inline def setPointattributelistUndefined: Self = StObject.set(x, "pointattributelist", js.undefined)
      
      inline def setPointattributelistVarargs(value: Double*): Self = StObject.set(x, "pointattributelist", js.Array(value*))
      
      inline def setPointlist(value: js.Array[Double]): Self = StObject.set(x, "pointlist", value.asInstanceOf[js.Any])
      
      inline def setPointlistVarargs(value: Double*): Self = StObject.set(x, "pointlist", js.Array(value*))
      
      inline def setPointmarkerlist(value: js.Array[Double]): Self = StObject.set(x, "pointmarkerlist", value.asInstanceOf[js.Any])
      
      inline def setPointmarkerlistUndefined: Self = StObject.set(x, "pointmarkerlist", js.undefined)
      
      inline def setPointmarkerlistVarargs(value: Double*): Self = StObject.set(x, "pointmarkerlist", js.Array(value*))
      
      inline def setRegionlist(value: js.Array[Double]): Self = StObject.set(x, "regionlist", value.asInstanceOf[js.Any])
      
      inline def setRegionlistUndefined: Self = StObject.set(x, "regionlist", js.undefined)
      
      inline def setRegionlistVarargs(value: Double*): Self = StObject.set(x, "regionlist", js.Array(value*))
      
      inline def setTrianglearealist(value: js.Array[Double]): Self = StObject.set(x, "trianglearealist", value.asInstanceOf[js.Any])
      
      inline def setTrianglearealistUndefined: Self = StObject.set(x, "trianglearealist", js.undefined)
      
      inline def setTrianglearealistVarargs(value: Double*): Self = StObject.set(x, "trianglearealist", js.Array(value*))
      
      inline def setTriangleattributelist(value: js.Array[Double]): Self = StObject.set(x, "triangleattributelist", value.asInstanceOf[js.Any])
      
      inline def setTriangleattributelistUndefined: Self = StObject.set(x, "triangleattributelist", js.undefined)
      
      inline def setTriangleattributelistVarargs(value: Double*): Self = StObject.set(x, "triangleattributelist", js.Array(value*))
      
      inline def setTrianglelist(value: js.Array[Double]): Self = StObject.set(x, "trianglelist", value.asInstanceOf[js.Any])
      
      inline def setTrianglelistUndefined: Self = StObject.set(x, "trianglelist", js.undefined)
      
      inline def setTrianglelistVarargs(value: Double*): Self = StObject.set(x, "trianglelist", js.Array(value*))
    }
  }
  
  trait TriangulateIO extends StObject {
    
    var edgelist: js.UndefOr[js.Array[Double]] = js.undefined
    
    var edgemarkerlist: js.UndefOr[js.Array[Double]] = js.undefined
    
    var holelist: js.UndefOr[js.Array[Double]] = js.undefined
    
    var neighborlist: js.UndefOr[js.Array[Double]] = js.undefined
    
    val numberofcorners: js.UndefOr[Double] = js.undefined
    
    val numberofedges: js.UndefOr[Double] = js.undefined
    
    val numberofholes: js.UndefOr[Double] = js.undefined
    
    val numberofpointattributes: js.UndefOr[Double] = js.undefined
    
    val numberofpoints: Double
    
    val numberofregions: js.UndefOr[Double] = js.undefined
    
    val numberofsegments: js.UndefOr[Double] = js.undefined
    
    val numberoftriangleattributes: js.UndefOr[Double] = js.undefined
    
    val numberoftriangles: js.UndefOr[Double] = js.undefined
    
    var pointattributelist: js.UndefOr[js.Array[Double]] = js.undefined
    
    // arr: Int32Array; // "private" properties
    // ptr: number; // "private" properties
    var pointlist: js.Array[Double]
    
    var pointmarkerlist: js.UndefOr[js.Array[Double]] = js.undefined
    
    var regionlist: js.UndefOr[js.Array[Double]] = js.undefined
    
    var trianglearealist: js.UndefOr[js.Array[Double]] = js.undefined
    
    var triangleattributelist: js.UndefOr[js.Array[Double]] = js.undefined
    
    var trianglelist: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object TriangulateIO {
    
    inline def apply(numberofpoints: Double, pointlist: js.Array[Double]): TriangulateIO = {
      val __obj = js.Dynamic.literal(numberofpoints = numberofpoints.asInstanceOf[js.Any], pointlist = pointlist.asInstanceOf[js.Any])
      __obj.asInstanceOf[TriangulateIO]
    }
    
    extension [Self <: TriangulateIO](x: Self) {
      
      inline def setEdgelist(value: js.Array[Double]): Self = StObject.set(x, "edgelist", value.asInstanceOf[js.Any])
      
      inline def setEdgelistUndefined: Self = StObject.set(x, "edgelist", js.undefined)
      
      inline def setEdgelistVarargs(value: Double*): Self = StObject.set(x, "edgelist", js.Array(value*))
      
      inline def setEdgemarkerlist(value: js.Array[Double]): Self = StObject.set(x, "edgemarkerlist", value.asInstanceOf[js.Any])
      
      inline def setEdgemarkerlistUndefined: Self = StObject.set(x, "edgemarkerlist", js.undefined)
      
      inline def setEdgemarkerlistVarargs(value: Double*): Self = StObject.set(x, "edgemarkerlist", js.Array(value*))
      
      inline def setHolelist(value: js.Array[Double]): Self = StObject.set(x, "holelist", value.asInstanceOf[js.Any])
      
      inline def setHolelistUndefined: Self = StObject.set(x, "holelist", js.undefined)
      
      inline def setHolelistVarargs(value: Double*): Self = StObject.set(x, "holelist", js.Array(value*))
      
      inline def setNeighborlist(value: js.Array[Double]): Self = StObject.set(x, "neighborlist", value.asInstanceOf[js.Any])
      
      inline def setNeighborlistUndefined: Self = StObject.set(x, "neighborlist", js.undefined)
      
      inline def setNeighborlistVarargs(value: Double*): Self = StObject.set(x, "neighborlist", js.Array(value*))
      
      inline def setNumberofcorners(value: Double): Self = StObject.set(x, "numberofcorners", value.asInstanceOf[js.Any])
      
      inline def setNumberofcornersUndefined: Self = StObject.set(x, "numberofcorners", js.undefined)
      
      inline def setNumberofedges(value: Double): Self = StObject.set(x, "numberofedges", value.asInstanceOf[js.Any])
      
      inline def setNumberofedgesUndefined: Self = StObject.set(x, "numberofedges", js.undefined)
      
      inline def setNumberofholes(value: Double): Self = StObject.set(x, "numberofholes", value.asInstanceOf[js.Any])
      
      inline def setNumberofholesUndefined: Self = StObject.set(x, "numberofholes", js.undefined)
      
      inline def setNumberofpointattributes(value: Double): Self = StObject.set(x, "numberofpointattributes", value.asInstanceOf[js.Any])
      
      inline def setNumberofpointattributesUndefined: Self = StObject.set(x, "numberofpointattributes", js.undefined)
      
      inline def setNumberofpoints(value: Double): Self = StObject.set(x, "numberofpoints", value.asInstanceOf[js.Any])
      
      inline def setNumberofregions(value: Double): Self = StObject.set(x, "numberofregions", value.asInstanceOf[js.Any])
      
      inline def setNumberofregionsUndefined: Self = StObject.set(x, "numberofregions", js.undefined)
      
      inline def setNumberofsegments(value: Double): Self = StObject.set(x, "numberofsegments", value.asInstanceOf[js.Any])
      
      inline def setNumberofsegmentsUndefined: Self = StObject.set(x, "numberofsegments", js.undefined)
      
      inline def setNumberoftriangleattributes(value: Double): Self = StObject.set(x, "numberoftriangleattributes", value.asInstanceOf[js.Any])
      
      inline def setNumberoftriangleattributesUndefined: Self = StObject.set(x, "numberoftriangleattributes", js.undefined)
      
      inline def setNumberoftriangles(value: Double): Self = StObject.set(x, "numberoftriangles", value.asInstanceOf[js.Any])
      
      inline def setNumberoftrianglesUndefined: Self = StObject.set(x, "numberoftriangles", js.undefined)
      
      inline def setPointattributelist(value: js.Array[Double]): Self = StObject.set(x, "pointattributelist", value.asInstanceOf[js.Any])
      
      inline def setPointattributelistUndefined: Self = StObject.set(x, "pointattributelist", js.undefined)
      
      inline def setPointattributelistVarargs(value: Double*): Self = StObject.set(x, "pointattributelist", js.Array(value*))
      
      inline def setPointlist(value: js.Array[Double]): Self = StObject.set(x, "pointlist", value.asInstanceOf[js.Any])
      
      inline def setPointlistVarargs(value: Double*): Self = StObject.set(x, "pointlist", js.Array(value*))
      
      inline def setPointmarkerlist(value: js.Array[Double]): Self = StObject.set(x, "pointmarkerlist", value.asInstanceOf[js.Any])
      
      inline def setPointmarkerlistUndefined: Self = StObject.set(x, "pointmarkerlist", js.undefined)
      
      inline def setPointmarkerlistVarargs(value: Double*): Self = StObject.set(x, "pointmarkerlist", js.Array(value*))
      
      inline def setRegionlist(value: js.Array[Double]): Self = StObject.set(x, "regionlist", value.asInstanceOf[js.Any])
      
      inline def setRegionlistUndefined: Self = StObject.set(x, "regionlist", js.undefined)
      
      inline def setRegionlistVarargs(value: Double*): Self = StObject.set(x, "regionlist", js.Array(value*))
      
      inline def setTrianglearealist(value: js.Array[Double]): Self = StObject.set(x, "trianglearealist", value.asInstanceOf[js.Any])
      
      inline def setTrianglearealistUndefined: Self = StObject.set(x, "trianglearealist", js.undefined)
      
      inline def setTrianglearealistVarargs(value: Double*): Self = StObject.set(x, "trianglearealist", js.Array(value*))
      
      inline def setTriangleattributelist(value: js.Array[Double]): Self = StObject.set(x, "triangleattributelist", value.asInstanceOf[js.Any])
      
      inline def setTriangleattributelistUndefined: Self = StObject.set(x, "triangleattributelist", js.undefined)
      
      inline def setTriangleattributelistVarargs(value: Double*): Self = StObject.set(x, "triangleattributelist", js.Array(value*))
      
      inline def setTrianglelist(value: js.Array[Double]): Self = StObject.set(x, "trianglelist", value.asInstanceOf[js.Any])
      
      inline def setTrianglelistUndefined: Self = StObject.set(x, "trianglelist", js.undefined)
      
      inline def setTrianglelistVarargs(value: Double*): Self = StObject.set(x, "trianglelist", js.Array(value*))
    }
  }
  
  trait TriangulateSwitches extends StObject {
    
    var area: js.UndefOr[Boolean | Double] = js.undefined
    
    var bndMarkers: js.UndefOr[Boolean] = js.undefined
    
    var ccdt: js.UndefOr[Boolean] = js.undefined
    
    var convexHull: js.UndefOr[Boolean] = js.undefined
    
    var edges: js.UndefOr[Boolean] = js.undefined
    
    var holes: js.UndefOr[Boolean] = js.undefined
    
    var jettison: js.UndefOr[Boolean] = js.undefined
    
    var neighbors: js.UndefOr[Boolean] = js.undefined
    
    var pslg: js.UndefOr[Boolean] = js.undefined
    
    var quadratic2: js.UndefOr[Boolean] = js.undefined
    
    var quality: js.UndefOr[Boolean | Double] = js.undefined
    
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    var refine: js.UndefOr[Boolean] = js.undefined
    
    var regionAttr: js.UndefOr[Boolean] = js.undefined
    
    var steiner: js.UndefOr[Double] = js.undefined
  }
  object TriangulateSwitches {
    
    inline def apply(): TriangulateSwitches = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TriangulateSwitches]
    }
    
    extension [Self <: TriangulateSwitches](x: Self) {
      
      inline def setArea(value: Boolean | Double): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
      
      inline def setBndMarkers(value: Boolean): Self = StObject.set(x, "bndMarkers", value.asInstanceOf[js.Any])
      
      inline def setBndMarkersUndefined: Self = StObject.set(x, "bndMarkers", js.undefined)
      
      inline def setCcdt(value: Boolean): Self = StObject.set(x, "ccdt", value.asInstanceOf[js.Any])
      
      inline def setCcdtUndefined: Self = StObject.set(x, "ccdt", js.undefined)
      
      inline def setConvexHull(value: Boolean): Self = StObject.set(x, "convexHull", value.asInstanceOf[js.Any])
      
      inline def setConvexHullUndefined: Self = StObject.set(x, "convexHull", js.undefined)
      
      inline def setEdges(value: Boolean): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
      
      inline def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
      
      inline def setHoles(value: Boolean): Self = StObject.set(x, "holes", value.asInstanceOf[js.Any])
      
      inline def setHolesUndefined: Self = StObject.set(x, "holes", js.undefined)
      
      inline def setJettison(value: Boolean): Self = StObject.set(x, "jettison", value.asInstanceOf[js.Any])
      
      inline def setJettisonUndefined: Self = StObject.set(x, "jettison", js.undefined)
      
      inline def setNeighbors(value: Boolean): Self = StObject.set(x, "neighbors", value.asInstanceOf[js.Any])
      
      inline def setNeighborsUndefined: Self = StObject.set(x, "neighbors", js.undefined)
      
      inline def setPslg(value: Boolean): Self = StObject.set(x, "pslg", value.asInstanceOf[js.Any])
      
      inline def setPslgUndefined: Self = StObject.set(x, "pslg", js.undefined)
      
      inline def setQuadratic2(value: Boolean): Self = StObject.set(x, "quadratic2", value.asInstanceOf[js.Any])
      
      inline def setQuadratic2Undefined: Self = StObject.set(x, "quadratic2", js.undefined)
      
      inline def setQuality(value: Boolean | Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setRefine(value: Boolean): Self = StObject.set(x, "refine", value.asInstanceOf[js.Any])
      
      inline def setRefineUndefined: Self = StObject.set(x, "refine", js.undefined)
      
      inline def setRegionAttr(value: Boolean): Self = StObject.set(x, "regionAttr", value.asInstanceOf[js.Any])
      
      inline def setRegionAttrUndefined: Self = StObject.set(x, "regionAttr", js.undefined)
      
      inline def setSteiner(value: Double): Self = StObject.set(x, "steiner", value.asInstanceOf[js.Any])
      
      inline def setSteinerUndefined: Self = StObject.set(x, "steiner", js.undefined)
    }
  }
}
