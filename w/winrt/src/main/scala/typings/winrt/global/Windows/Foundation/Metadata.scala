package typings.winrt.global.Windows.Foundation

import typings.winrt.Windows.Foundation.Metadata.AttributeTargets
import typings.winrt.Windows.Foundation.Metadata.CompositionType
import typings.winrt.Windows.Foundation.Metadata.MarshalingType
import typings.winrt.Windows.Foundation.Metadata.ThreadingModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Metadata {
  
  @JSGlobal("Windows.Foundation.Metadata.ActivatableAttribute")
  @js.native
  open class ActivatableAttribute protected ()
    extends StObject
       with typings.winrt.Windows.Foundation.Metadata.ActivatableAttribute {
    def this(version: Double) = this()
    def this(`type`: String, version: Double) = this()
  }
  
  @JSGlobal("Windows.Foundation.Metadata.AllowMultipleAttribute")
  @js.native
  open class AllowMultipleAttribute ()
    extends StObject
       with typings.winrt.Windows.Foundation.Metadata.AllowMultipleAttribute
  
  @JSGlobal("Windows.Foundation.Metadata.AttributeTargets")
  @js.native
  object AttributeTargets extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Foundation.Metadata.AttributeTargets & Double] = js.native
    
    /* 0 */ val all: typings.winrt.Windows.Foundation.Metadata.AttributeTargets.all & Double = js.native
    
    /* 1 */ val delegate: typings.winrt.Windows.Foundation.Metadata.AttributeTargets.delegate & Double = js.native
    
    /* 2 */ val `enum`: typings.winrt.Windows.Foundation.Metadata.AttributeTargets.`enum` & Double = js.native
    
    /* 3 */ val event: typings.winrt.Windows.Foundation.Metadata.AttributeTargets.event & Double = js.native
    
    /* 4 */ val field: typings.winrt.Windows.Foundation.Metadata.AttributeTargets.field & Double = js.native
    
    /* 5 */ val interface: typings.winrt.Windows.Foundation.Metadata.AttributeTargets.interface & Double = js.native
    
    /* 11 */ val interfaceImpl: typings.winrt.Windows.Foundation.Metadata.AttributeTargets.interfaceImpl & Double = js.native
    
    /* 6 */ val method: typings.winrt.Windows.Foundation.Metadata.AttributeTargets.method & Double = js.native
    
    /* 7 */ val parameter: typings.winrt.Windows.Foundation.Metadata.AttributeTargets.parameter & Double = js.native
    
    /* 8 */ val property: typings.winrt.Windows.Foundation.Metadata.AttributeTargets.property & Double = js.native
    
    /* 9 */ val runtimeClass: typings.winrt.Windows.Foundation.Metadata.AttributeTargets.runtimeClass & Double = js.native
    
    /* 10 */ val struct: typings.winrt.Windows.Foundation.Metadata.AttributeTargets.struct & Double = js.native
  }
  
  @JSGlobal("Windows.Foundation.Metadata.AttributeUsageAttribute")
  @js.native
  open class AttributeUsageAttribute protected ()
    extends StObject
       with typings.winrt.Windows.Foundation.Metadata.AttributeUsageAttribute {
    def this(targets: AttributeTargets) = this()
  }
  
  @JSGlobal("Windows.Foundation.Metadata.ComposableAttribute")
  @js.native
  open class ComposableAttribute protected ()
    extends StObject
       with typings.winrt.Windows.Foundation.Metadata.ComposableAttribute {
    def this(`type`: String, compositionType: CompositionType, version: Double) = this()
  }
  
  @JSGlobal("Windows.Foundation.Metadata.CompositionType")
  @js.native
  object CompositionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Foundation.Metadata.CompositionType & Double] = js.native
    
    /* 0 */ val `protected`: typings.winrt.Windows.Foundation.Metadata.CompositionType.`protected` & Double = js.native
    
    /* 1 */ val public: typings.winrt.Windows.Foundation.Metadata.CompositionType.public & Double = js.native
  }
  
  @JSGlobal("Windows.Foundation.Metadata.DefaultAttribute")
  @js.native
  open class DefaultAttribute ()
    extends StObject
       with typings.winrt.Windows.Foundation.Metadata.DefaultAttribute
  
  @JSGlobal("Windows.Foundation.Metadata.DefaultOverloadAttribute")
  @js.native
  open class DefaultOverloadAttribute ()
    extends StObject
       with typings.winrt.Windows.Foundation.Metadata.DefaultOverloadAttribute
  
  @JSGlobal("Windows.Foundation.Metadata.DualApiPartitionAttribute")
  @js.native
  open class DualApiPartitionAttribute ()
    extends StObject
       with typings.winrt.Windows.Foundation.Metadata.DualApiPartitionAttribute
  
  @JSGlobal("Windows.Foundation.Metadata.ExclusiveToAttribute")
  @js.native
  open class ExclusiveToAttribute protected ()
    extends StObject
       with typings.winrt.Windows.Foundation.Metadata.ExclusiveToAttribute {
    def this(typeName: String) = this()
  }
  
  @JSGlobal("Windows.Foundation.Metadata.GCPressureAmount")
  @js.native
  object GCPressureAmount extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Foundation.Metadata.GCPressureAmount & Double] = js.native
    
    /* 2 */ val high: typings.winrt.Windows.Foundation.Metadata.GCPressureAmount.high & Double = js.native
    
    /* 0 */ val low: typings.winrt.Windows.Foundation.Metadata.GCPressureAmount.low & Double = js.native
    
    /* 1 */ val medium: typings.winrt.Windows.Foundation.Metadata.GCPressureAmount.medium & Double = js.native
  }
  
  @JSGlobal("Windows.Foundation.Metadata.GCPressureAttribute")
  @js.native
  open class GCPressureAttribute ()
    extends StObject
       with typings.winrt.Windows.Foundation.Metadata.GCPressureAttribute
  
  @JSGlobal("Windows.Foundation.Metadata.GuidAttribute")
  @js.native
  open class GuidAttribute protected ()
    extends StObject
       with typings.winrt.Windows.Foundation.Metadata.GuidAttribute {
    def this(
      a: Double,
      b: Double,
      c: Double,
      d: Double,
      e: Double,
      f: Double,
      g: Double,
      h: Double,
      i: Double,
      j: Double,
      k: Double
    ) = this()
  }
  
  @JSGlobal("Windows.Foundation.Metadata.HasVariantAttribute")
  @js.native
  open class HasVariantAttribute ()
    extends StObject
       with typings.winrt.Windows.Foundation.Metadata.HasVariantAttribute
  
  @JSGlobal("Windows.Foundation.Metadata.LengthIsAttribute")
  @js.native
  open class LengthIsAttribute protected ()
    extends StObject
       with typings.winrt.Windows.Foundation.Metadata.LengthIsAttribute {
    def this(indexLengthParameter: Double) = this()
  }
  
  @JSGlobal("Windows.Foundation.Metadata.MarshalingBehaviorAttribute")
  @js.native
  open class MarshalingBehaviorAttribute protected ()
    extends StObject
       with typings.winrt.Windows.Foundation.Metadata.MarshalingBehaviorAttribute {
    def this(behavior: MarshalingType) = this()
  }
  
  @JSGlobal("Windows.Foundation.Metadata.MarshalingType")
  @js.native
  object MarshalingType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Foundation.Metadata.MarshalingType & Double] = js.native
    
    /* 1 */ val agile: typings.winrt.Windows.Foundation.Metadata.MarshalingType.agile & Double = js.native
    
    /* 3 */ val invalidMarshaling: typings.winrt.Windows.Foundation.Metadata.MarshalingType.invalidMarshaling & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Foundation.Metadata.MarshalingType.none & Double = js.native
    
    /* 2 */ val standard: typings.winrt.Windows.Foundation.Metadata.MarshalingType.standard & Double = js.native
  }
  
  @JSGlobal("Windows.Foundation.Metadata.MuseAttribute")
  @js.native
  open class MuseAttribute ()
    extends StObject
       with typings.winrt.Windows.Foundation.Metadata.MuseAttribute
  
  @JSGlobal("Windows.Foundation.Metadata.OverloadAttribute")
  @js.native
  open class OverloadAttribute protected ()
    extends StObject
       with typings.winrt.Windows.Foundation.Metadata.OverloadAttribute {
    def this(method: String) = this()
  }
  
  @JSGlobal("Windows.Foundation.Metadata.OverridableAttribute")
  @js.native
  open class OverridableAttribute ()
    extends StObject
       with typings.winrt.Windows.Foundation.Metadata.OverridableAttribute
  
  @JSGlobal("Windows.Foundation.Metadata.ProtectedAttribute")
  @js.native
  open class ProtectedAttribute ()
    extends StObject
       with typings.winrt.Windows.Foundation.Metadata.ProtectedAttribute
  
  @JSGlobal("Windows.Foundation.Metadata.RangeAttribute")
  @js.native
  open class RangeAttribute protected ()
    extends StObject
       with typings.winrt.Windows.Foundation.Metadata.RangeAttribute {
    def this(minValue: Double, maxValue: Double) = this()
  }
  
  @JSGlobal("Windows.Foundation.Metadata.StaticAttribute")
  @js.native
  open class StaticAttribute protected ()
    extends StObject
       with typings.winrt.Windows.Foundation.Metadata.StaticAttribute {
    def this(`type`: String, version: Double) = this()
  }
  
  @JSGlobal("Windows.Foundation.Metadata.ThreadingAttribute")
  @js.native
  open class ThreadingAttribute protected ()
    extends StObject
       with typings.winrt.Windows.Foundation.Metadata.ThreadingAttribute {
    def this(model: ThreadingModel) = this()
  }
  
  @JSGlobal("Windows.Foundation.Metadata.ThreadingModel")
  @js.native
  object ThreadingModel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Foundation.Metadata.ThreadingModel & Double] = js.native
    
    /* 2 */ val both: typings.winrt.Windows.Foundation.Metadata.ThreadingModel.both & Double = js.native
    
    /* 3 */ val invalidThreading: typings.winrt.Windows.Foundation.Metadata.ThreadingModel.invalidThreading & Double = js.native
    
    /* 1 */ val mTA: typings.winrt.Windows.Foundation.Metadata.ThreadingModel.mTA & Double = js.native
    
    /* 0 */ val sTA: typings.winrt.Windows.Foundation.Metadata.ThreadingModel.sTA & Double = js.native
  }
  
  @JSGlobal("Windows.Foundation.Metadata.VariantAttribute")
  @js.native
  open class VariantAttribute ()
    extends StObject
       with typings.winrt.Windows.Foundation.Metadata.VariantAttribute
  
  @JSGlobal("Windows.Foundation.Metadata.VersionAttribute")
  @js.native
  open class VersionAttribute protected ()
    extends StObject
       with typings.winrt.Windows.Foundation.Metadata.VersionAttribute {
    def this(version: Double) = this()
  }
  
  @JSGlobal("Windows.Foundation.Metadata.WebHostHiddenAttribute")
  @js.native
  open class WebHostHiddenAttribute ()
    extends StObject
       with typings.winrt.Windows.Foundation.Metadata.WebHostHiddenAttribute
}
