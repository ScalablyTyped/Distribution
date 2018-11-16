package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AggregatedResultsAnalysis extends js.Object {
  var duration: js.Any
  var notReportedResultsByOutcome: ScalablyTyped.runtime.NumberDictionary[AggregatedResultsByOutcome]
  var previousContext: TestResultsContext
  var resultsByOutcome: ScalablyTyped.runtime.NumberDictionary[AggregatedResultsByOutcome]
  var resultsDifference: AggregatedResultsDifference
  var totalTests: scala.Double
}

