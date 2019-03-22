organization := "org.scalablytyped"
name := "trash"
version := "5.0.0-bbe12d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-edb918",
  "org.scalablytyped" %%% "cp-file" % "6.1.0-9320cc",
  "org.scalablytyped" %%% "dir-glob" % "2.0-dt-20181212Z-6b9642",
  "org.scalablytyped" %%% "fast-glob" % "2.2.6-8d8f96",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-2e51d2",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180214Z-ec6929",
  "org.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180607Z-9d06cf",
  "org.scalablytyped" %%% "globby" % "9.1.0-fcc6b4",
  "org.scalablytyped" %%% "graceful-fs" % "4.1-dt-20190212Z-a95c83",
  "org.scalablytyped" %%% "ignore" % "3.3.10-bb014f",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180214Z-399c7b",
  "org.scalablytyped" %%% "make-dir" % "2.1.0-24d042",
  "org.scalablytyped" %%% "merge2" % "1.1-dt-20180214Z-5f9447",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-3ed78d",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-0a2b2c",
  "org.scalablytyped" %%% "move-file" % "1.1.0-83cb36",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-5e947e",
  "org.scalablytyped" %%% "nested-error-stacks" % "2.1-dt-20180828Z-9c6116",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190320Z-26b6b7",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-9382e4",
  "org.scalablytyped" %%% "p-map" % "2.0.0-8063aa",
  "org.scalablytyped" %%% "p-try" % "2.0-dt-20180621Z-4ca324",
  "org.scalablytyped" %%% "path-exists" % "3.0-dt-20180214Z-1f4c03",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-937816",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-b5df74",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cc5b51",
  "org.scalablytyped" %%% "slash" % "2.0-dt-20181224Z-adddb4",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-ccdaec")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        