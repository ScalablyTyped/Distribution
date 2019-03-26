organization := "org.scalablytyped"
name := "trash"
version := "5.0.0-5dc333"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-7fa312",
  "org.scalablytyped" %%% "cp-file" % "6.1.0-4acae1",
  "org.scalablytyped" %%% "dir-glob" % "2.0-dt-20181212Z-deae1c",
  "org.scalablytyped" %%% "fast-glob" % "2.2.6-c24471",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-805214",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180214Z-f2c726",
  "org.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180607Z-26f135",
  "org.scalablytyped" %%% "globby" % "9.1.0-489de4",
  "org.scalablytyped" %%% "graceful-fs" % "4.1-dt-20190212Z-856ebf",
  "org.scalablytyped" %%% "ignore" % "3.3.10-3555b0",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180214Z-35474d",
  "org.scalablytyped" %%% "make-dir" % "2.1.0-b62219",
  "org.scalablytyped" %%% "merge2" % "1.1-dt-20180214Z-361ba9",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-78c499",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-cec35d",
  "org.scalablytyped" %%% "move-file" % "1.1.0-03de29",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-08c936",
  "org.scalablytyped" %%% "nested-error-stacks" % "2.1-dt-20180828Z-67b4ea",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-3a21ff",
  "org.scalablytyped" %%% "p-map" % "2.0.0-267ed6",
  "org.scalablytyped" %%% "p-try" % "2.0-dt-20180621Z-11921f",
  "org.scalablytyped" %%% "path-exists" % "3.0-dt-20180214Z-6a3c8e",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20190322Z-89c2de",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-1895d1",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-816092",
  "org.scalablytyped" %%% "slash" % "2.0-dt-20181224Z-886cfc",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-43c72f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        