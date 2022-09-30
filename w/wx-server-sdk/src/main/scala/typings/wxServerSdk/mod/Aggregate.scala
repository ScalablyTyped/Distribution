package typings.wxServerSdk.mod

import org.scalablytyped.runtime.StringDictionary
import typings.wxServerSdk.anon.Boundaries
import typings.wxServerSdk.anon.Buckets
import typings.wxServerSdk.anon.DictfieldName
import typings.wxServerSdk.anon.DistanceField
import typings.wxServerSdk.anon.IncludeArrayIndex
import typings.wxServerSdk.anon.NewRoot
import typings.wxServerSdk.anon.Size
import typings.wxServerSdk.wxServerSdkInts.`-1`
import typings.wxServerSdk.wxServerSdkInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aggregate extends StObject {
  
  def addFields(fieldObj: StringDictionary[Any]): Aggregate
  
  def bucket(bucketObj: Boundaries): Aggregate
  
  def bucketAuto(bucketObj: Buckets): Aggregate
  
  def count(expr: String): Any
  
  def end(): Unit
  
  def geoNear(geoNearObj: DistanceField): Aggregate
  
  def group(groupObj: DictfieldName): Aggregate
  
  def limit(limitRecords: Double): Any
  
  def `match`(matchObj: StringDictionary[Any]): Aggregate
  
  def project(projectObj: StringDictionary[Any]): Aggregate
  
  def replaceRoot(replaceRootObj: NewRoot): Aggregate
  
  def sample(replaceRootObj: Size): Aggregate
  
  def skip(skipNum: Double): Any
  
  def sort(replaceRootObj: StringDictionary[`1` | `-1`]): Aggregate
  
  def sortByCount(fieldName: String): Aggregate
  
  def unwind(unwindObj: IncludeArrayIndex): Aggregate
}
object Aggregate {
  
  inline def apply(
    addFields: StringDictionary[Any] => Aggregate,
    bucket: Boundaries => Aggregate,
    bucketAuto: Buckets => Aggregate,
    count: String => Any,
    end: () => Unit,
    geoNear: DistanceField => Aggregate,
    group: DictfieldName => Aggregate,
    limit: Double => Any,
    `match`: StringDictionary[Any] => Aggregate,
    project: StringDictionary[Any] => Aggregate,
    replaceRoot: NewRoot => Aggregate,
    sample: Size => Aggregate,
    skip: Double => Any,
    sort: StringDictionary[`1` | `-1`] => Aggregate,
    sortByCount: String => Aggregate,
    unwind: IncludeArrayIndex => Aggregate
  ): Aggregate = {
    val __obj = js.Dynamic.literal(addFields = js.Any.fromFunction1(addFields), bucket = js.Any.fromFunction1(bucket), bucketAuto = js.Any.fromFunction1(bucketAuto), count = js.Any.fromFunction1(count), end = js.Any.fromFunction0(end), geoNear = js.Any.fromFunction1(geoNear), group = js.Any.fromFunction1(group), limit = js.Any.fromFunction1(limit), project = js.Any.fromFunction1(project), replaceRoot = js.Any.fromFunction1(replaceRoot), sample = js.Any.fromFunction1(sample), skip = js.Any.fromFunction1(skip), sort = js.Any.fromFunction1(sort), sortByCount = js.Any.fromFunction1(sortByCount), unwind = js.Any.fromFunction1(unwind))
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[Aggregate]
  }
  
  extension [Self <: Aggregate](x: Self) {
    
    inline def setAddFields(value: StringDictionary[Any] => Aggregate): Self = StObject.set(x, "addFields", js.Any.fromFunction1(value))
    
    inline def setBucket(value: Boundaries => Aggregate): Self = StObject.set(x, "bucket", js.Any.fromFunction1(value))
    
    inline def setBucketAuto(value: Buckets => Aggregate): Self = StObject.set(x, "bucketAuto", js.Any.fromFunction1(value))
    
    inline def setCount(value: String => Any): Self = StObject.set(x, "count", js.Any.fromFunction1(value))
    
    inline def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    inline def setGeoNear(value: DistanceField => Aggregate): Self = StObject.set(x, "geoNear", js.Any.fromFunction1(value))
    
    inline def setGroup(value: DictfieldName => Aggregate): Self = StObject.set(x, "group", js.Any.fromFunction1(value))
    
    inline def setLimit(value: Double => Any): Self = StObject.set(x, "limit", js.Any.fromFunction1(value))
    
    inline def setMatch(value: StringDictionary[Any] => Aggregate): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
    
    inline def setProject(value: StringDictionary[Any] => Aggregate): Self = StObject.set(x, "project", js.Any.fromFunction1(value))
    
    inline def setReplaceRoot(value: NewRoot => Aggregate): Self = StObject.set(x, "replaceRoot", js.Any.fromFunction1(value))
    
    inline def setSample(value: Size => Aggregate): Self = StObject.set(x, "sample", js.Any.fromFunction1(value))
    
    inline def setSkip(value: Double => Any): Self = StObject.set(x, "skip", js.Any.fromFunction1(value))
    
    inline def setSort(value: StringDictionary[`1` | `-1`] => Aggregate): Self = StObject.set(x, "sort", js.Any.fromFunction1(value))
    
    inline def setSortByCount(value: String => Aggregate): Self = StObject.set(x, "sortByCount", js.Any.fromFunction1(value))
    
    inline def setUnwind(value: IncludeArrayIndex => Aggregate): Self = StObject.set(x, "unwind", js.Any.fromFunction1(value))
  }
}
