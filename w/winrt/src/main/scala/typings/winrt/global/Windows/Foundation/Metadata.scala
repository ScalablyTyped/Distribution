package typings.winrt.global.Windows.Foundation

import typings.winrt.Windows.Foundation.Metadata.AttributeTargets
import typings.winrt.Windows.Foundation.Metadata.CompositionType
import typings.winrt.Windows.Foundation.Metadata.MarshalingType
import typings.winrt.Windows.Foundation.Metadata.ThreadingModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Metadata {
  
  @JSGlobal("Windows.Foundation.Metadata.ActivatableAttribute")
  @js.native
  class ActivatableAttribute protected ()
    extends typings.winrt.Windows.Foundation.Metadata.ActivatableAttribute {
    def this(version: Double) = this()
    def this(`type`: String, version: Double) = this()
  }
  
  @JSGlobal("Windows.Foundation.Metadata.AllowMultipleAttribute")
  @js.native
  class AllowMultipleAttribute ()
    extends typings.winrt.Windows.Foundation.Metadata.AllowMultipleAttribute
  
  @JSGlobal("Windows.Foundation.Metadata.AttributeTargets")
  @js.native
  object AttributeTargets extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Foundation.Metadata.AttributeTargets with Double] = js.native
    
    /* 0 */ val all: typings.winrt.Windows.Foundation.Metadata.AttributeTargets.all with Double = js.native
    
    /* 1 */ val delegate: typings.winrt.Windows.Foundation.Metadata.AttributeTargets.delegate with Double = js.native
    
    /* 2 */ val enum: typings.winrt.Windows.Foundation.Metadata.AttributeTargets.enum with Double = js.native
    
    /* 3 */ val event: typings.winrt.Windows.Foundation.Metadata.AttributeTargets.event with Double = js.native
    
    /* 4 */ val field: typings.winrt.Windows.Foundation.Metadata.AttributeTargets.field with Double = js.native
    
    /* 5 */ val interface: typings.winrt.Windows.Foundation.Metadata.AttributeTargets.interface with Double = js.native
    
    /* 11 */ val interfaceImpl: typings.winrt.Windows.Foundation.Metadata.AttributeTargets.interfaceImpl with Double = js.native
    
    /* 6 */ val method: typings.winrt.Windows.Foundation.Metadata.AttributeTargets.method with Double = js.native
    
    /* 7 */ val parameter: typings.winrt.Windows.Foundation.Metadata.AttributeTargets.parameter with Double = js.native
    
    /* 8 */ val property: typings.winrt.Windows.Foundation.Metadata.AttributeTargets.property with Double = js.native
    
    /* 9 */ val runtimeClass: typings.winrt.Windows.Foundation.Metadata.AttributeTargets.runtimeClass with Double = js.native
    
    /* 10 */ val struct: typings.winrt.Windows.Foundation.Metadata.AttributeTargets.struct with Double = js.native
  }
  
  @JSGlobal("Windows.Foundation.Metadata.AttributeUsageAttribute")
  @js.native
  class AttributeUsageAttribute protected ()
    extends typings.winrt.Windows.Foundation.Metadata.AttributeUsageAttribute {
    def this(targets: AttributeTargets) = this()
  }
  
  @JSGlobal("Windows.Foundation.Metadata.ComposableAttribute")
  @js.native
  class ComposableAttribute protected ()
    extends typings.winrt.Windows.Foundation.Metadata.ComposableAttribute {
    def this(`type`: String, compositionType: CompositionType, version: Double) = this()
  }
  
  @JSGlobal("Windows.Foundation.Metadata.CompositionType")
  @js.native
  object CompositionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Foundation.Metadata.CompositionType with Double] = js.native
    
    /* 0 */ val `protected`: typings.winrt.Windows.Foundation.Metadata.CompositionType.`protected` with Double = js.native
    
    /* 1 */ val public: typings.winrt.Windows.Foundation.Metadata.CompositionType.public with Double = js.native
  }
  
  @JSGlobal("Windows.Foundation.Metadata.DefaultAttribute")
  @js.native
  class DefaultAttribute ()
    extends typings.winrt.Windows.Foundation.Metadata.DefaultAttribute
  
  @JSGlobal("Windows.Foundation.Metadata.DefaultOverloadAttribute")
  @js.native
  class DefaultOverloadAttribute ()
    extends typings.winrt.Windows.Foundation.Metadata.DefaultOverloadAttribute
  
  @JSGlobal("Windows.Foundation.Metadata.DualApiPartitionAttribute")
  @js.native
  class DualApiPartitionAttribute ()
    extends typings.winrt.Windows.Foundation.Metadata.DualApiPartitionAttribute
  
  @JSGlobal("Windows.Foundation.Metadata.ExclusiveToAttribute")
  @js.native
  class ExclusiveToAttribute protected ()
    extends typings.winrt.Windows.Foundation.Metadata.ExclusiveToAttribute {
    def this(typeName: String) = this()
  }
  
  @JSGlobal("Windows.Foundation.Metadata.GCPressureAmount")
  @js.native
  object GCPressureAmount extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Foundation.Metadata.GCPressureAmount with Double] = js.native
    
    /* 2 */ val high: typings.winrt.Windows.Foundation.Metadata.GCPressureAmount.high with Double = js.native
    
    /* 0 */ val low: typings.winrt.Windows.Foundation.Metadata.GCPressureAmount.low with Double = js.native
    
    /* 1 */ val medium: typings.winrt.Windows.Foundation.Metadata.GCPressureAmount.medium with Double = js.native
  }
  
  @JSGlobal("Windows.Foundation.Metadata.GCPressureAttribute")
  @js.native
  class GCPressureAttribute ()
    extends typings.winrt.Windows.Foundation.Metadata.GCPressureAttribute
  
  @JSGlobal("Windows.Foundation.Metadata.GuidAttribute")
  @js.native
  class GuidAttribute protected ()
    extends typings.winrt.Windows.Foundation.Metadata.GuidAttribute {
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
  class HasVariantAttribute ()
    extends typings.winrt.Windows.Foundation.Metadata.HasVariantAttribute
  
  @JSGlobal("Windows.Foundation.Metadata.LengthIsAttribute")
  @js.native
  class LengthIsAttribute protected ()
    extends typings.winrt.Windows.Foundation.Metadata.LengthIsAttribute {
    def this(indexLengthParameter: Double) = this()
  }
  
  @JSGlobal("Windows.Foundation.Metadata.MarshalingBehaviorAttribute")
  @js.native
  class MarshalingBehaviorAttribute protected ()
    extends typings.winrt.Windows.Foundation.Metadata.MarshalingBehaviorAttribute {
    def this(behavior: MarshalingType) = this()
  }
  
  @JSGlobal("Windows.Foundation.Metadata.MarshalingType")
  @js.native
  object MarshalingType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Foundation.Metadata.MarshalingType with Double] = js.native
    
    /* 1 */ val agile: typings.winrt.Windows.Foundation.Metadata.MarshalingType.agile with Double = js.native
    
    /* 3 */ val invalidMarshaling: typings.winrt.Windows.Foundation.Metadata.MarshalingType.invalidMarshaling with Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Foundation.Metadata.MarshalingType.none with Double = js.native
    
    /* 2 */ val standard: typings.winrt.Windows.Foundation.Metadata.MarshalingType.standard with Double = js.native
  }
  
  @JSGlobal("Windows.Foundation.Metadata.MuseAttribute")
  @js.native
  class MuseAttribute ()
    extends typings.winrt.Windows.Foundation.Metadata.MuseAttribute
  
  @JSGlobal("Windows.Foundation.Metadata.OverloadAttribute")
  @js.native
  class OverloadAttribute protected ()
    extends typings.winrt.Windows.Foundation.Metadata.OverloadAttribute {
    def this(method: String) = this()
  }
  
  @JSGlobal("Windows.Foundation.Metadata.OverridableAttribute")
  @js.native
  class OverridableAttribute ()
    extends typings.winrt.Windows.Foundation.Metadata.OverridableAttribute
  
  @JSGlobal("Windows.Foundation.Metadata.ProtectedAttribute")
  @js.native
  class ProtectedAttribute ()
    extends typings.winrt.Windows.Foundation.Metadata.ProtectedAttribute
  
  @JSGlobal("Windows.Foundation.Metadata.RangeAttribute")
  @js.native
  class RangeAttribute protected ()
    extends typings.winrt.Windows.Foundation.Metadata.RangeAttribute {
    def this(minValue: Double, maxValue: Double) = this()
  }
  
  @JSGlobal("Windows.Foundation.Metadata.StaticAttribute")
  @js.native
  class StaticAttribute protected ()
    extends typings.winrt.Windows.Foundation.Metadata.StaticAttribute {
    def this(`type`: String, version: Double) = this()
  }
  
  @JSGlobal("Windows.Foundation.Metadata.ThreadingAttribute")
  @js.native
  class ThreadingAttribute protected ()
    extends typings.winrt.Windows.Foundation.Metadata.ThreadingAttribute {
    def this(model: ThreadingModel) = this()
  }
  
  @JSGlobal("Windows.Foundation.Metadata.ThreadingModel")
  @js.native
  object ThreadingModel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Foundation.Metadata.ThreadingModel with Double] = js.native
    
    /* 2 */ val both: typings.winrt.Windows.Foundation.Metadata.ThreadingModel.both with Double = js.native
    
    /* 3 */ val invalidThreading: typings.winrt.Windows.Foundation.Metadata.ThreadingModel.invalidThreading with Double = js.native
    
    /* 1 */ val mTA: typings.winrt.Windows.Foundation.Metadata.ThreadingModel.mTA with Double = js.native
    
    /* 0 */ val sTA: typings.winrt.Windows.Foundation.Metadata.ThreadingModel.sTA with Double = js.native
  }
  
  @JSGlobal("Windows.Foundation.Metadata.VariantAttribute")
  @js.native
  class VariantAttribute ()
    extends typings.winrt.Windows.Foundation.Metadata.VariantAttribute
  
  @JSGlobal("Windows.Foundation.Metadata.VersionAttribute")
  @js.native
  class VersionAttribute protected ()
    extends typings.winrt.Windows.Foundation.Metadata.VersionAttribute {
    def this(version: Double) = this()
  }
  
  @JSGlobal("Windows.Foundation.Metadata.WebHostHiddenAttribute")
  @js.native
  class WebHostHiddenAttribute ()
    extends typings.winrt.Windows.Foundation.Metadata.WebHostHiddenAttribute
}
