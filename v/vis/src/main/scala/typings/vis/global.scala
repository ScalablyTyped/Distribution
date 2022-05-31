package typings.vis

import typings.std.HTMLElement
import typings.vis.mod.Data
import typings.vis.mod.DataGroup
import typings.vis.mod.DataGroupCollectionType
import typings.vis.mod.DataItem
import typings.vis.mod.DataItemCollectionType
import typings.vis.mod.DataSetOptions
import typings.vis.mod.Edge
import typings.vis.mod.Graph2dOptions
import typings.vis.mod.Node
import typings.vis.mod.Options
import typings.vis.mod.TimelineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object vis {
    
    @JSGlobal("vis.DataSet")
    @js.native
    /**
      * Creates an instance of DataSet.
      *
      * @param [data] An Array with items.
      * @param [options] DataSet options.
      */
    class DataSet[T /* <: DataItem | DataGroup | Node | Edge */] ()
      extends typings.vis.mod.DataSet[T] {
      def this(data: js.Array[T]) = this()
      /**
        * Creates an instance of DataSet.
        *
        * @param [options] DataSet options.
        */
      def this(options: DataSetOptions) = this()
      def this(data: js.Array[T], options: DataSetOptions) = this()
      def this(data: Unit, options: DataSetOptions) = this()
    }
    
    @JSGlobal("vis.DataView")
    @js.native
    class DataView[T /* <: DataItem | DataGroup */] protected ()
      extends typings.vis.mod.DataView[T] {
      def this(items: js.Array[T]) = this()
    }
    
    @JSGlobal("vis.Graph2d")
    @js.native
    class Graph2d protected ()
      extends typings.vis.mod.Graph2d {
      def this(container: HTMLElement, items: DataItemCollectionType) = this()
      def this(container: HTMLElement, items: DataItemCollectionType, groups: DataGroupCollectionType) = this()
      def this(container: HTMLElement, items: DataItemCollectionType, options: Graph2dOptions) = this()
      def this(
        container: HTMLElement,
        items: DataItemCollectionType,
        groups: DataGroupCollectionType,
        options: Graph2dOptions
      ) = this()
    }
    
    @JSGlobal("vis.Network")
    @js.native
    class Network protected ()
      extends typings.vis.mod.Network {
      /**
        * Creates an instance of Network.
        *
        * @param container the HTML element representing the network container
        * @param data network data
        * @param [options] optional network options
        */
      def this(container: HTMLElement, data: Data) = this()
      def this(container: HTMLElement, data: Data, options: Options) = this()
    }
    
    @JSGlobal("vis.Timeline")
    @js.native
    class Timeline protected ()
      extends typings.vis.mod.Timeline {
      def this(container: HTMLElement, items: DataItemCollectionType) = this()
      def this(container: HTMLElement, items: DataItemCollectionType, groups: DataGroupCollectionType) = this()
      def this(container: HTMLElement, items: DataItemCollectionType, options: TimelineOptions) = this()
      def this(
        container: HTMLElement,
        items: DataItemCollectionType,
        groups: DataGroupCollectionType,
        options: TimelineOptions
      ) = this()
    }
  }
}
